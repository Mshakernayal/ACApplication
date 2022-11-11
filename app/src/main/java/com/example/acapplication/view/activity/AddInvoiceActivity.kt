package com.example.acapplication.view.activity

import android.Manifest
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.AnimationUtils
import android.view.animation.TranslateAnimation
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.transition.Fade
import androidx.transition.TransitionManager
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import com.example.acapplication.R
import com.example.acapplication.databinding.ActivityAddInvoiceBinding
import com.example.acapplication.model.entity.DailyDetailsEntity
import com.example.acapplication.model.entity.InvoiceEntity
import com.example.acapplication.util.classes.Permissions
import com.example.acapplication.util.classes.Requests
import com.example.acapplication.viewmodel.InvoiceViewModel
import com.example.acapplication.viewmodel.viewmodelfactory.InvoiceViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_add_invoice.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.net.URL
import javax.inject.Inject

@AndroidEntryPoint
class AddInvoiceActivity : AppCompatActivity() {

    private var isAdding = true
    private var currentDailyDetailsEntity : DailyDetailsEntity? = null
    private var currentInvoiceEntity : InvoiceEntity? = null

    private lateinit var binding : ActivityAddInvoiceBinding

    private var imageUrl : Uri? = null

    @Inject
    lateinit var invoiceViewModelFactory: InvoiceViewModelFactory
    private lateinit var invoiceViewModel: InvoiceViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddInvoiceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        invoiceViewModel = ViewModelProvider(this,invoiceViewModelFactory)[InvoiceViewModel::class.java]

        binding.invoiceFromCompany.visibility = View.GONE
        binding.invoiceOnCompany.visibility = View.GONE

        CoroutineScope(Dispatchers.Main).launch {
            val clientNameList = invoiceViewModel.getAllNameClient()
            val arrayAdapter = ArrayAdapter(this@AddInvoiceActivity,android.R.layout.simple_list_item_1,clientNameList)
            binding.autoTxtActivityAddInvoiceBuyerName.setAdapter(arrayAdapter)
            binding.autoTxtActivityAddInvoiceSupplierName.setAdapter(arrayAdapter)
        }

        isAdding = intent.getBooleanExtra("isAdding",true)

        if(!isAdding)
        {
            binding.btnActivityAddInvoiceCancel.visibility = View.GONE

            currentDailyDetailsEntity = intent.getSerializableExtra("dailyDetailsEntity") as DailyDetailsEntity?
            currentInvoiceEntity = intent.getSerializableExtra("invoiceEntity") as InvoiceEntity?

            currentInvoiceEntity?.let {
                if(currentInvoiceEntity?.invoiceState == 'f')
                {
                    binding.imgInvoiceFromCompany.rotation = 180F
                    binding.invoiceFromCompany.visibility = View.VISIBLE
                    binding.autoTxtActivityAddInvoiceBuyerName.setText(it.name)
                    binding.edtActivityAddInvoiceBuyerItemTypeType.setText(it.itemType)
                    binding.edtActivityAddInvoiceBuyerNumber.setText(it.number.toString())
                    binding.edtActivityAddInvoiceBuyerMeter.setText(it.meter.toString())
                    binding.edtActivityAddInvoiceBuyerPrice.setText(it.price.toString())
                    binding.edtActivityAddInvoiceBuyerNotice.setText(it.notice)
                }
                else
                {
                    binding.imgInvoiceOnCompany.rotation = 180F
                    binding.invoiceOnCompany.visibility = View.VISIBLE
                    binding.autoTxtActivityAddInvoiceSupplierName.setText(it.name)
                    binding.edtActivityAddInvoiceSupplierItemtype.setText(it.itemType)
                    binding.edtActivityAddInvoiceSupplierNumber.setText(it.number.toString())
                    binding.edtActivityAddInvoiceSupplierMeter.setText(it.meter.toString())
                    binding.edtActivityAddInvoiceSupplierPrice.setText(it.price.toString())
                    binding.edtActivityAddInvoiceSupplierSpend.setText(it.spend!!.toString())
                    binding.edtActivityAddInvoiceSupplierNotice.setText(it.notice)
                }
            }
        }

        binding.imgInvoiceFromCompany.setOnClickListener {
            imgFromRotation()
        }

        binding.imgInvoiceOnCompany.setOnClickListener {
            imgOnRotation()
        }

        binding.imgActivityAddInvoiceLogo.setOnClickListener {
            if(Permissions.isPermissionGranted(this, arrayOf(
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.READ_EXTERNAL_STORAGE
            )))
            {
                Requests.chooseImage(this,null)
            }
            else
            {
                Permissions.requestRunTimePermission(this,null, arrayOf(
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.READ_EXTERNAL_STORAGE
                ),Permissions.ADD_INVOICE_LOGO_PERMISSION_CODE)
            }
        }

        binding.btnActivityAddInvoiceSave.setOnClickListener {

            if(isAdding)
            {
                if(binding.invoiceFromCompany.visibility == View.VISIBLE)
                {
                    val name = binding.autoTxtActivityAddInvoiceBuyerName.text.toString()
                    val number = binding.edtActivityAddInvoiceBuyerNumber.text.toString().toInt()
                    val meter =  binding.edtActivityAddInvoiceBuyerMeter.text.toString().toInt()
                    val price = binding.edtActivityAddInvoiceBuyerPrice.text.toString().toInt()
                    val totalMoney = number*(meter*price)
                    val barcodeNumber = binding.txtActivityAddInvoiceBarcodeNumber.text.toString()
                    CoroutineScope(Dispatchers.Main).launch {
                        val clientId  = invoiceViewModel.getIdClientByName(name)
                        val dailyDetailsEntity = DailyDetailsEntity(imageUrl.toString(),name,totalMoney,barcodeNumber,"invo_From",1,clientId)
                        invoiceViewModel.insertDailyDetails(dailyDetailsEntity)
                    }
                }
                else
                {
                    val name = binding.autoTxtActivityAddInvoiceSupplierName.text.toString()
                    val number = binding.edtActivityAddInvoiceSupplierNumber.text.toString().toInt()
                    val meter =  binding.edtActivityAddInvoiceSupplierMeter.text.toString().toInt()
                    val price = binding.edtActivityAddInvoiceSupplierPrice.text.toString().toInt()
                    val spend = binding.edtActivityAddInvoiceSupplierSpend.text.toString().toInt()
                    val totalMoney = (number*(meter*price))+spend
                    val barcodeNumber = binding.txtActivityAddInvoiceBarcodeNumber.text.toString()
                    CoroutineScope(Dispatchers.Main).launch {
                        val clientId = invoiceViewModel.getIdClientByName(name)
                        val dailyDetailsEntity = DailyDetailsEntity(imageUrl.toString(),name,totalMoney,barcodeNumber,"invo_on",1,clientId)
                        invoiceViewModel.insertDailyDetails(dailyDetailsEntity)
                    }
                }
            }
            else
            {
                if(binding.invoiceFromCompany.visibility == View.VISIBLE)
                {
                    val name = binding.autoTxtActivityAddInvoiceBuyerName.text.toString()
                    val itemType = binding.edtActivityAddInvoiceBuyerItemTypeType.text.toString()
                    val number = binding.edtActivityAddInvoiceBuyerNumber.text.toString().toInt()
                    val meter =  binding.edtActivityAddInvoiceBuyerMeter.text.toString().toInt()
                    val price = binding.edtActivityAddInvoiceBuyerPrice.text.toString().toInt()
                    val notice = binding.edtActivityAddInvoiceBuyerNotice.text.toString()
                    val totalMoney = number*(meter*price)

                    if(imageUrl != null) currentDailyDetailsEntity?.image = imageUrl!!.toString()
                    currentDailyDetailsEntity?.name = name
                    currentDailyDetailsEntity?.totalMoney = totalMoney
                    invoiceViewModel.updateDailyDetails(currentDailyDetailsEntity!!)

                    currentInvoiceEntity?.name = name
                    currentInvoiceEntity?.itemType = itemType
                    currentInvoiceEntity?.number = number
                    currentInvoiceEntity?.meter = meter
                    currentInvoiceEntity?.price = price
                    currentInvoiceEntity?.notice = notice
                    invoiceViewModel.update(currentInvoiceEntity!!)
                }
                else
                {
                    val name = binding.autoTxtActivityAddInvoiceSupplierName.text.toString()
                    val itemType = binding.edtActivityAddInvoiceSupplierItemtype.text.toString()
                    val number = binding.edtActivityAddInvoiceSupplierNumber.text.toString().toInt()
                    val meter =  binding.edtActivityAddInvoiceSupplierMeter.text.toString().toInt()
                    val price = binding.edtActivityAddInvoiceSupplierPrice.text.toString().toInt()
                    val spend = binding.edtActivityAddInvoiceSupplierSpend.text.toString().toInt()
                    val notice = binding.edtActivityAddInvoiceSupplierNotice.text.toString()
                    val totalMoney = (number*(meter*price))+spend

                    if(imageUrl != null) currentDailyDetailsEntity?.image = imageUrl!!.toString()
                    currentDailyDetailsEntity?.name = name
                    currentDailyDetailsEntity?.totalMoney = totalMoney
                    invoiceViewModel.updateDailyDetails(currentDailyDetailsEntity!!)

                    currentInvoiceEntity?.name = name
                    currentInvoiceEntity?.itemType = itemType
                    currentInvoiceEntity?.number = number
                    currentInvoiceEntity?.meter = meter
                    currentInvoiceEntity?.price = price
                    currentInvoiceEntity?.spend = spend
                    currentInvoiceEntity?.notice = notice
                    invoiceViewModel.update(currentInvoiceEntity!!)
                }
            }
            finish()

            getLastDailyDetailsId()
        }

        binding.btnActivityAddInvoiceCancel.setOnClickListener {
            finish()
        }
    }

    private fun getLastDailyDetailsId()
    {
        invoiceViewModel.getLastDailyDetailsId().observe(this, Observer {
            CoroutineScope(Dispatchers.Main).launch {
                val idDailyDetails = invoiceViewModel.getMaxDailyDetails()
                if(it != 0 && it==idDailyDetails)
                {
                    if(invoiceFromCompany.visibility == View.VISIBLE)
                    {
                        val name = binding.autoTxtActivityAddInvoiceBuyerName.text.toString()
                        val itemType = binding.edtActivityAddInvoiceBuyerItemTypeType.text.toString()
                        val number = binding.edtActivityAddInvoiceBuyerNumber.text.toString().toInt()
                        val meter = binding.edtActivityAddInvoiceBuyerMeter.text.toString().toInt()
                        val price = binding.edtActivityAddInvoiceBuyerPrice.text.toString().toInt()
                        val notice = binding.edtActivityAddInvoiceBuyerNotice.text.toString()
                        val invoiceEntity = InvoiceEntity(name,itemType,number,meter,price,null,notice,'f',it)
                        invoiceViewModel.insert(invoiceEntity)
                    }
                    else
                    {
                        val name = binding.autoTxtActivityAddInvoiceSupplierName.text.toString()
                        val itemType = binding.edtActivityAddInvoiceSupplierItemtype.text.toString()
                        val number = binding.edtActivityAddInvoiceSupplierNumber.text.toString().toInt()
                        val meter = binding.edtActivityAddInvoiceSupplierMeter.text.toString().toInt()
                        val price = binding.edtActivityAddInvoiceSupplierPrice.text.toString().toInt()
                        val spend = binding.edtActivityAddInvoiceSupplierSpend.text.toString().toInt()
                        val notice = binding.edtActivityAddInvoiceSupplierNotice.text.toString()
                        val invoiceEntity = InvoiceEntity(name,itemType,number,meter,price,spend,notice,'o',it)
                        invoiceViewModel.insert(invoiceEntity)
                    }
                }
            }
        })
    }

    private fun imgFromRotation()
    {
        if(binding.imgInvoiceFromCompany.rotation==0F)
        {
            if(binding.invoiceOnCompany.visibility == View.VISIBLE)
            {
                binding.imgInvoiceOnCompany.rotation = 0F
                binding.invoiceOnCompany.visibility = View.GONE
            }
            binding.imgInvoiceFromCompany.rotation = 180F
            binding.invoiceFromCompany.visibility = View.VISIBLE
            binding.invoiceFromCompany.startAnimation(AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left))
        }
        else
        {
            binding.imgInvoiceFromCompany.rotation = 0F
            binding.invoiceFromCompany.visibility = View.GONE
        }
    }

    private fun imgOnRotation()
    {
        if(binding.imgInvoiceOnCompany.rotation==0F)
        {
            if(invoiceFromCompany.visibility == View.VISIBLE)
            {
                binding.imgInvoiceFromCompany.rotation = 0F
                binding.invoiceFromCompany.visibility = View.GONE
            }
            binding.imgInvoiceOnCompany.rotation = 180F
            binding.invoiceOnCompany.visibility = View.VISIBLE
            binding.invoiceOnCompany.startAnimation(AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left))
        }
        else
        {
            binding.imgInvoiceOnCompany.rotation = 0F
            binding.invoiceOnCompany.visibility = View.GONE
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(Permissions.isPermissionGranted(this, arrayOf(
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE
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
                    imageUrl = it.data!!
                }
                binding.imgActivityAddInvoiceLogo.setBackgroundColor(Color.parseColor("#11B763"))
            }
        }
    }
}