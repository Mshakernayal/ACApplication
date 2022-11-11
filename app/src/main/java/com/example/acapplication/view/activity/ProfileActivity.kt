package com.example.acapplication.view.activity

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.acapplication.R
import com.example.acapplication.databinding.ActivityProfileBinding
import com.example.acapplication.model.entity.ClientEntity
import com.example.acapplication.util.classes.Permissions
import com.example.acapplication.util.classes.Requests
import com.example.acapplication.view.adapter.ProfileActivityRecentActionRecyclerAdapter
import com.example.acapplication.viewmodel.ClientViewModel
import com.example.acapplication.viewmodel.viewmodelfactory.ClientViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import java.io.Serializable
import javax.inject.Inject

@AndroidEntryPoint
class ProfileActivity : AppCompatActivity() {

    private lateinit var currentClientEntity: ClientEntity

    private lateinit var binding : ActivityProfileBinding

    @Inject
    lateinit var clientViewModelFactory: ClientViewModelFactory
    private lateinit var clientViewModel: ClientViewModel

    private lateinit var profileActivityRecentActionRecyclerAdapter : ProfileActivityRecentActionRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clientViewModel = ViewModelProvider(this,clientViewModelFactory)[ClientViewModel::class.java]

        currentClientEntity = intent.getSerializableExtra("clientEntity") as ClientEntity
        binding.txtActivityProfileClientName.text = currentClientEntity.name
        binding.txtActivityProfileClientAddress.text = currentClientEntity.address
        binding.txtActivityProfilePhoneClient.text = currentClientEntity.phone
        val clientPhone = currentClientEntity.phone

        profileActivityRecentActionRecyclerAdapter = ProfileActivityRecentActionRecyclerAdapter()
        binding.recyclerActivityProfileClientActivity.adapter = profileActivityRecentActionRecyclerAdapter

        binding.imgActivityProfileProfileImage.setOnClickListener {
            if (Permissions.isPermissionGranted(this, arrayOf(
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
                ),Permissions.PROFILE_PHOTO_PERMISSION_CODE)
            }
        }

        binding.btnActivityProfileCall.setOnClickListener {
            if(Permissions.isPermissionGranted(this, arrayOf(Manifest.permission.CALL_PHONE)))
            {
                val intent = Intent(Intent.ACTION_CALL)
                intent.setData(Uri.parse("tel:$clientPhone"))
                startActivity(intent)
            }
            else
            {
                Permissions.requestRunTimePermission(this,null,
                arrayOf(Manifest.permission.CALL_PHONE),Permissions.PROFILE_CALL_PERMISSION_CODE)
            }
        }

        binding.btnActivityProfileChat.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=$clientPhone"))
            startActivity(intent)
        }

        getAllClient()
    }

    private fun getAllClient()
    {
        clientViewModel.getAllDailyDetailsByByClientId(currentClientEntity.id!!).observe(this, Observer {
            profileActivityRecentActionRecyclerAdapter.submitList(it)
        })
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if(requestCode == Permissions.PROFILE_CALL_PERMISSION_CODE)
        {
            if(! Permissions.isPermissionGranted(this, arrayOf(Manifest.permission.CALL_PHONE)))
            {
                Toast.makeText(this,"Sorry You Should Accept This Request",Toast.LENGTH_SHORT).show()
            }
        }
        else
        {
            if(Permissions.isPermissionGranted(this, arrayOf(
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                )))
            {
                Requests.chooseImage(this,null)
            }
            else
            {
                Toast.makeText(this,"Sorry You Should Accept The Requests", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK)
        {
            if(requestCode == Requests.GALLERY_REQUEST_CODE)
            {
                data?.let {
                    binding.imgActivityProfileProfileImage.setImageURI(it.data!!)
                }
            }
        }
    }
}