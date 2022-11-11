package com.example.acapplication.view.activity

import android.Manifest
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.acapplication.databinding.ActivityAddPaymentBinding
import com.example.acapplication.model.entity.DailyDetailsEntity
import com.example.acapplication.model.entity.PaymentEntity
import com.example.acapplication.util.classes.Permissions
import com.example.acapplication.util.classes.Requests
import com.example.acapplication.viewmodel.PaymentViewModel
import com.example.acapplication.viewmodel.viewmodelfactory.PaymentViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class AddPaymentActivity() : AppCompatActivity() {

    var isAdding : Boolean = true
    var currentDailyDetailsEntity : DailyDetailsEntity? = null
    var currentPaymentEntity : PaymentEntity? = null

    lateinit var binding : ActivityAddPaymentBinding

    @Inject
    lateinit var paymentViewModelFactory: PaymentViewModelFactory
    private lateinit var paymentViewModel: PaymentViewModel

    private var imageUrl : Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        paymentViewModel = ViewModelProvider(this,paymentViewModelFactory)[PaymentViewModel::class.java]

        binding.paymentToCompany.visibility = View.GONE
        binding.paymentFromCompany.visibility = View.GONE

        isAdding = intent.getBooleanExtra("isAdding",true)

        //make logo and number pay
        if(!isAdding)
        {
            currentDailyDetailsEntity = intent.getSerializableExtra("dailyDetailsEntity") as DailyDetailsEntity?
            currentPaymentEntity = intent.getSerializableExtra("PaymentEntity") as PaymentEntity?

            binding.btnActivityAddPaymentCancel.visibility = View.GONE

            currentPaymentEntity?.let {

                if(it.paymentState == 't')
                {
                    binding.paymentToCompany.visibility = View.VISIBLE
                    binding.imgPaymentToCompany.rotation = 180F
                    binding.autoTxtActivityAddPaymentToPayerName.setText(it.name)
                    binding.edtActivityAddPaymentToTotalMoneyType.setText(it.totalMoney.toString())
                    binding.edtActivityAddPaymentToNotice.setText(it.notice)
                }
                else
                {
                    binding.paymentFromCompany.visibility = View.VISIBLE
                    binding.imgPaymentFromCompany.rotation = 180F
                    binding.autoTxtActivityAddPaymentFromCatcherName.setText(it.name)
                    binding.edtActivityAddPaymentFromTotalMoney.setText(it.totalMoney.toString())
                    binding.edtActivityAddPaymentFromNotice.setText(it.notice)
                }
            }
        }

        CoroutineScope(Dispatchers.Main).launch {
            val clientNameList = paymentViewModel.getAllNameClient()
            val arrayAdapter = ArrayAdapter(this@AddPaymentActivity,android.R.layout.simple_list_item_1,clientNameList)
            binding.autoTxtActivityAddPaymentToPayerName.setAdapter(arrayAdapter)
            binding.autoTxtActivityAddPaymentFromCatcherName.setAdapter(arrayAdapter)
        }

        binding.imgPaymentToCompany.setOnClickListener {
            imgToRotation()
        }

        binding.imgPaymentFromCompany.setOnClickListener {
            imgFromCompany()
        }

        binding.imgActivityAddInvoiceLogo.setOnClickListener {
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
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                ),Permissions.ADD_PAYMENT_LOGO_PERMISSION_CODE)
            }
        }

        binding.btnActivityAddPaymentSave.setOnClickListener {

            if(isAdding)
            {
                if(binding.paymentToCompany.visibility == View.VISIBLE)
                {
                    val name = binding.autoTxtActivityAddPaymentToPayerName.text.toString()
                    val totalMoney = binding.edtActivityAddPaymentToTotalMoneyType.text.toString().toInt()
                    val barcodeNo = binding.txtActivityAddPaymentBarcodeNo.text.toString()
                    CoroutineScope(Dispatchers.Main).launch {
                        val clientId = paymentViewModel.getIdClientByName(name)
                        val dailyDetailsEntity = DailyDetailsEntity(imageUrl.toString(),name,totalMoney,barcodeNo,"payto",2,clientId)
                        paymentViewModel.insertDailyDetails(dailyDetailsEntity)
                    }
                }
                else
                {
                    val name = binding.autoTxtActivityAddPaymentFromCatcherName.text.toString()
                    val totalMoney = binding.edtActivityAddPaymentFromTotalMoney.text.toString().toInt()
                    val barcodeNo = binding.txtActivityAddPaymentBarcodeNo.text.toString()
                    CoroutineScope(Dispatchers.Main).launch {
                        val clientId = paymentViewModel.getIdClientByName(name)
                        val dailyDetailsEntity = DailyDetailsEntity(imageUrl.toString(),name,totalMoney,barcodeNo,"payfrom",2,clientId)
                        paymentViewModel.insertDailyDetails(dailyDetailsEntity)
                    }
                }
            }
            else
            {
                if(binding.paymentToCompany.visibility == View.VISIBLE)
                {
                    val name = binding.autoTxtActivityAddPaymentToPayerName.text.toString()
                    val totalMoney = binding.edtActivityAddPaymentToTotalMoneyType.text.toString().toInt()
                    val notice = binding.edtActivityAddPaymentToNotice.text.toString()

                    if(imageUrl != null) currentDailyDetailsEntity?.image = imageUrl!!.toString()
                    currentDailyDetailsEntity?.name = name
                    currentDailyDetailsEntity?.totalMoney = totalMoney
                    paymentViewModel.updateDailyDetails(currentDailyDetailsEntity!!)

                    currentPaymentEntity?.name = name
                    currentPaymentEntity?.totalMoney = totalMoney
                    currentPaymentEntity?.notice = notice
                    paymentViewModel.update(currentPaymentEntity!!)
                }
                else
                {
                    val name = binding.autoTxtActivityAddPaymentFromCatcherName.text.toString()
                    val totalMoney = binding.edtActivityAddPaymentFromTotalMoney.text.toString().toInt()
                    val notice = binding.edtActivityAddPaymentFromNotice.text.toString()

                    if(imageUrl != null) currentDailyDetailsEntity?.image = imageUrl!!.toString()
                    currentDailyDetailsEntity?.name = name
                    currentDailyDetailsEntity?.totalMoney = totalMoney
                    currentPaymentEntity?.notice = notice
                    paymentViewModel.updateDailyDetails(currentDailyDetailsEntity!!)

                    currentPaymentEntity?.name = name
                    currentPaymentEntity?.totalMoney = totalMoney
                    currentPaymentEntity?.notice = notice
                    paymentViewModel.update(currentPaymentEntity!!)
                }
            }
            finish()

            getLastDailyDetailsId()
        }

        binding.btnActivityAddPaymentCancel.setOnClickListener {
            if(isAdding)
            {
                finish()
            }
        }
    }

    private fun getLastDailyDetailsId()
    {
        paymentViewModel.getLastDailyDetailsId().observe(this, Observer {
            CoroutineScope(Dispatchers.Main).launch {
                val idDailyDetails = paymentViewModel.getMaxDailyDetails()
                if(it != 0 && it==idDailyDetails)
                {
                    if(binding.paymentToCompany.visibility == View.VISIBLE)
                    {
                        val name = binding.autoTxtActivityAddPaymentToPayerName.text.toString()
                        val totalMoney = binding.edtActivityAddPaymentToTotalMoneyType.text.toString().toInt()
                        val notice = binding.edtActivityAddPaymentToNotice.text.toString()
                        val paymentEntity = PaymentEntity(name,totalMoney,notice,it,'t')
                        paymentViewModel.insert(paymentEntity)
                    }
                    else
                    {
                        val name = binding.autoTxtActivityAddPaymentFromCatcherName.text.toString()
                        val totalMoney = binding.edtActivityAddPaymentFromTotalMoney.text.toString().toInt()
                        val notice = binding.edtActivityAddPaymentFromNotice.text.toString()
                        val paymentEntity = PaymentEntity(name,totalMoney,notice,it,'f')
                        paymentViewModel.insert(paymentEntity)
                    }
                }
            }
        })
    }

    private fun imgToRotation()
    {
        if(binding.imgPaymentToCompany.rotation == 0F)
        {
            if(binding.imgPaymentFromCompany.rotation == 180F)
            {
                binding.imgPaymentFromCompany.rotation = 0F
                binding.paymentFromCompany.visibility = View.GONE
            }
            binding.imgPaymentToCompany.rotation = 180F
            binding.paymentToCompany.visibility = View.VISIBLE
            binding.paymentToCompany.startAnimation(AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left))
        }
        else
        {
            binding.imgPaymentToCompany.rotation = 0F
            binding.paymentToCompany.visibility = View.GONE
        }
    }

    private fun imgFromCompany()
    {
        if(binding.imgPaymentFromCompany.rotation == 0F)
        {
            if(binding.imgPaymentToCompany.rotation == 180F)
            {
                binding.imgPaymentToCompany.rotation = 0F
                binding.paymentToCompany.visibility = View.GONE
            }
            binding.imgPaymentFromCompany.rotation = 180F
            binding.paymentFromCompany.visibility = View.VISIBLE
            binding.paymentFromCompany.startAnimation(AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left))
        }
        else
        {
            binding.imgPaymentFromCompany.rotation = 0F
            binding.paymentFromCompany.visibility = View.GONE
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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == RESULT_OK)
        {
            if(requestCode == Requests.GALLERY_REQUEST_CODE)
            {
                data?.let {
                    imageUrl = it.data
                    binding.imgActivityAddInvoiceLogo.setBackgroundColor(Color.parseColor("#11B763"))
                }
            }
        }
    }
}