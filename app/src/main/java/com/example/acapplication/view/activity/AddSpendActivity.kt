package com.example.acapplication.view.activity

import android.Manifest
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.acapplication.databinding.ActivityAddSpendBinding
import com.example.acapplication.model.entity.DailyDetailsEntity
import com.example.acapplication.model.entity.PaymentEntity
import com.example.acapplication.model.entity.SpendEntity
import com.example.acapplication.util.classes.Permissions
import com.example.acapplication.util.classes.Requests
import com.example.acapplication.viewmodel.AddSpendViewModel
import com.example.acapplication.viewmodel.PaymentViewModel
import com.example.acapplication.viewmodel.viewmodelfactory.AddSpendViewModelFactory
import com.example.acapplication.viewmodel.viewmodelfactory.PaymentViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_add_payment.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class AddSpendActivity : AppCompatActivity() {

    private var isAdding = true
    private var currentDailyDetailsEntity : DailyDetailsEntity? = null
    private var currentSpendEntity : SpendEntity? = null

    private lateinit var binding : ActivityAddSpendBinding

    @Inject
    lateinit var addSpendViewModelFactory: AddSpendViewModelFactory
    private lateinit var addSpendViewModel: AddSpendViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddSpendBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addSpendViewModel = ViewModelProvider(this,addSpendViewModelFactory)[AddSpendViewModel::class.java]

        isAdding = intent.getBooleanExtra("isAdding",true)

        if(!isAdding)
        {
            currentDailyDetailsEntity = intent.getSerializableExtra("dailyDetailsEntity") as DailyDetailsEntity?
            currentSpendEntity = intent.getSerializableExtra("spendEntity") as SpendEntity?

            binding.btnActivityAddSpendAddCancel.visibility = View.GONE

            currentSpendEntity?.let {
                binding.edtActivityAddSpendDetails.setText(it.details)
                binding.edtActivityAddSpendTotalMoney.setText(it.totalMoney.toString())
                binding.edtActivityAddSpendNotice.setText(it.notice)
            }
        }

        binding.imgActivityAddInvoiceLogo.setOnClickListener {
            if(Permissions.isPermissionGranted(this,
                    arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE
                        , Manifest.permission.WRITE_EXTERNAL_STORAGE)))
            {
                Requests.chooseImage(this,null)
            }
            else
            {
                Permissions.requestRunTimePermission(this,null,
                arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE),
                    Permissions.ADD_SPEND_LOGO_PERMISSION_CODE)
            }
        }

        binding.btnActivityAddSpendSave.setOnClickListener {

            val details = binding.edtActivityAddSpendDetails.text.toString()
            val totalMoney = binding.edtActivityAddSpendTotalMoney.text.toString().toInt()
            val notice = binding.edtActivityAddSpendNotice.text.toString()
            val barcodeNumber = binding.txtActivityAddSpendBarcodeNumber.text.toString()
            if(isAdding)
            {
                val dailyDetailsEntity = DailyDetailsEntity(null,details,totalMoney,barcodeNumber,"spend",3,null)
                addSpendViewModel.insertDailyDetails(dailyDetailsEntity)
            }
            else
            {
                currentDailyDetailsEntity?.name = details
                currentDailyDetailsEntity?.totalMoney = totalMoney
                addSpendViewModel.updateDailyDetails(currentDailyDetailsEntity!!)

                currentSpendEntity?.details =  details
                currentSpendEntity?.totalMoney = totalMoney
                currentSpendEntity?.notice = notice
                addSpendViewModel.updateSpend(currentSpendEntity!!)
            }

            finish()

            getLastDailyDetailsId()
        }

        binding.btnActivityAddSpendAddCancel.setOnClickListener {
            finish()
        }
    }

    fun getLastDailyDetailsId()
    {
        addSpendViewModel.getLastDailyDetailsId().observe(this, Observer {
            CoroutineScope(Dispatchers.Main).launch {
                val idDailyDetails = addSpendViewModel.getMaxDailyDetails()
                if(it != 0 && it == idDailyDetails)
                {
                    val details = binding.edtActivityAddSpendDetails.text.toString()
                    val totalMoney = binding.edtActivityAddSpendTotalMoney.text.toString().toInt()
                    val notice = binding.edtActivityAddSpendNotice.text.toString()
                    val spendEntity = SpendEntity(details,totalMoney,notice,idDailyDetails)
                    addSpendViewModel.insertSpend(spendEntity)
                }
            }
        })
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(Permissions.isPermissionGranted(this, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE)))
        {
            Requests.chooseImage(this,null)
        }
        else
        {
            Toast.makeText(this,"Sorry You Should Accept The Requests",Toast.LENGTH_SHORT).show()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == RESULT_OK)
        {
            if(requestCode == Requests.GALLERY_REQUEST_CODE)
            {
                val imageUri = data?.data

            }
        }
    }
}