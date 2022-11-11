package com.example.acapplication.view.activity

import android.Manifest
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.acapplication.databinding.ActivityAddClientBinding
import com.example.acapplication.model.entity.ClientEntity
import com.example.acapplication.util.classes.Constants
import com.example.acapplication.util.classes.Permissions
import com.example.acapplication.util.classes.Requests
import com.example.acapplication.viewmodel.ClientViewModel
import com.example.acapplication.viewmodel.viewmodelfactory.ClientViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class AddClientActivity : AppCompatActivity() {

    private lateinit var binding : ActivityAddClientBinding

    @Inject
    lateinit var clientViewModelFactory: ClientViewModelFactory
    private lateinit var clientViewModel: ClientViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddClientBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clientViewModel = ViewModelProvider(this,clientViewModelFactory)[ClientViewModel::class.java]

        binding.imgDialogAddClient.setOnClickListener {
            if(Permissions.isPermissionGranted(this, arrayOf(
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                )))
            {
                Requests.chooseImage(this,null)
            }
            else
            {
                Permissions.requestRunTimePermission(this,null, arrayOf(
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                ), Permissions.ADD_CLIENT_PHOTO_PERMISSION_CODE)
            }
        }

        binding.btnDialogAddClientSave.setOnClickListener {
            val image = Constants.getBytesFromImageView(binding.imgDialogAddClient)
            val name = binding.edtDialogAddClientName.text.toString()
            val address = binding.edtDialogAddClientAddress.text.toString()
            val phone = binding.edtDialogAddClientPhone.text.toString()
            val clientEntity = ClientEntity(image, name, address, phone)
            clientViewModel.insertClientName(clientEntity)
            finish()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == RESULT_OK)
        {
            if(requestCode == Requests.GALLERY_REQUEST_CODE)
            {
                data?.let {
                    val imageUri = it.data!!
                    binding.imgDialogAddClient.setImageURI(imageUri)
                }
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(Permissions.isPermissionGranted(this, arrayOf(
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
        )))
        {
            Requests.chooseImage(this,null)
        }
        else
        {
            Toast.makeText(this,"Sorry You Should Accept The Requests",Toast.LENGTH_SHORT).show()
        }
    }

}