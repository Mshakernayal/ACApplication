package com.example.acapplication.view.dialog

import android.Manifest
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.acapplication.databinding.DialogAddClientBinding
import com.example.acapplication.model.entity.ClientEntity
import com.example.acapplication.util.classes.Constants
import com.example.acapplication.util.classes.Permissions
import com.example.acapplication.util.classes.Requests
import com.example.acapplication.viewmodel.ClientViewModel
import com.example.acapplication.viewmodel.viewmodelfactory.ClientViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class AddClientDialog(val imageUri: Uri?) : DialogFragment() {

    private var _binding : DialogAddClientBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var clientViewModelFactory: ClientViewModelFactory
    private lateinit var clientViewModel: ClientViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DialogAddClientBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clientViewModel = ViewModelProvider(requireActivity(),clientViewModelFactory)[ClientViewModel::class.java]

        imageUri?.let {
            binding.imgDialogAddClient.setImageURI(it)
        }

        binding.imgDialogAddClient.setOnClickListener {
            if(Permissions.isPermissionGranted(requireContext(), arrayOf(
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
            )))
            {
                if(imageUri == null)
                {
                    Requests.chooseImage(requireActivity(),null)
                }
                else
                {
                    Toast.makeText(requireContext(),"Sorry You Should Close This Page To Choose Another Image Again",Toast.LENGTH_SHORT).show()
                }
            }
            else
            {
                Permissions.requestRunTimePermission(requireActivity(),null, arrayOf(
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                ),Permissions.ADD_CLIENT_PHOTO_PERMISSION_CODE)
            }
        }
        binding.btnDialogAddClientSave.setOnClickListener {
            val ima = binding.imgDialogAddClient.toString()
            val image = Constants.getBytesFromImageView(binding.imgDialogAddClient)
            val name = binding.edtDialogAddClientName.text.toString()
            val address = binding.edtDialogAddClientAddress.text.toString()
            val phone = binding.edtDialogAddClientPhone.text.toString()
            val clientEntity = ClientEntity(image, name, address, phone)
            clientViewModel.insertClientName(clientEntity)
            dismiss()
        }

        binding.btnDialogAddClientCancel.setOnClickListener {
            dismiss()
        }

        getMutableLiveData()
    }

    fun getMutableLiveData()
    {
        clientViewModel.getMutableLiveData().observe(this, Observer {
            Log.e("lolo",it.toString())
        })
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(Permissions.isPermissionGranted(requireContext(), arrayOf(
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE)))
        {
            Requests.chooseImage(requireActivity(),null)
        }
        else
        {
            Toast.makeText(requireContext(),"Sorry You Should Accept The Requests",Toast.LENGTH_SHORT).show()
        }
    }



}