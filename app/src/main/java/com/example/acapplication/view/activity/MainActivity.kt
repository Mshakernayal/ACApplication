package com.example.acapplication.view.activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import com.example.acapplication.R
import com.example.acapplication.databinding.ActivityMainBinding
import com.example.acapplication.model.entity.ClientEntity
import com.example.acapplication.model.entity.DailyDetailsEntity
import com.example.acapplication.util.classes.Requests
import com.example.acapplication.util.interfaces.OnClientNameClickListener
import com.example.acapplication.util.interfaces.OnDailyDetailsItemClickListener
import com.example.acapplication.view.adapter.MainActivityDailyDetailsRecyclerAdapter
import com.example.acapplication.view.adapter.MainActivityNamesRecyclerAdapter
import com.example.acapplication.view.dialog.AddClientDialog
import com.example.acapplication.viewmodel.DailyDetailsViewModel
import com.example.acapplication.viewmodel.viewmodelfactory.DailyDetailsViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() , OnClientNameClickListener , OnDailyDetailsItemClickListener{

    private lateinit var addClientDialog: AddClientDialog

    private lateinit var binding : ActivityMainBinding
    private lateinit var imageUri: Uri

    @Inject
    lateinit var dailyDetailsViewModelFactory: DailyDetailsViewModelFactory
    private lateinit var dailyDetailsViewModel: DailyDetailsViewModel

    private lateinit var dailyDetailsRecyclerAdapter : MainActivityDailyDetailsRecyclerAdapter
    private lateinit var clientRecyclerAdapter: MainActivityNamesRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        dailyDetailsViewModel = ViewModelProvider(this,dailyDetailsViewModelFactory)[DailyDetailsViewModel::class.java]

        dailyDetailsRecyclerAdapter = MainActivityDailyDetailsRecyclerAdapter(this)
        binding.recyclerActivityMainDetails.adapter = dailyDetailsRecyclerAdapter

        clientRecyclerAdapter = MainActivityNamesRecyclerAdapter(this)
        binding.recyclerActivityMainNames.adapter = clientRecyclerAdapter

        binding.btnActivityMainAdd.setOnClickListener {
            val intent = Intent(this,AddClientActivity::class.java)
            startActivity(intent)
//            addClientDialog = AddClientDialog(null)
//            addClientDialog.setStyle(DialogFragment.STYLE_NORMAL,R.style.DialogFragmentTheme)
//            addClientDialog.show(supportFragmentManager,"AddClient")
        }

        binding.btnActivityMainInvoice.setOnClickListener {
            val intent = Intent(this,AddInvoiceActivity::class.java)
            startActivity(intent)
            binding.fabActivityMainMenu.close(true)
        }

        binding.btnActivityMainPayment.setOnClickListener {
            val intent = Intent(this,AddPaymentActivity::class.java)
            startActivity(intent)
            Animatoo.animateFade(this)
            binding.fabActivityMainMenu.close(true)
        }

        binding.btnActivityMainSpend.setOnClickListener {
            val intent = Intent(this,AddSpendActivity::class.java)
            startActivity(intent)
            binding.fabActivityMainMenu.close(true)
        }

        getAllDailyDetails()
        getAllClientName()
        getMutableLiveData()
    }

    private fun getAllDailyDetails()
    {
        dailyDetailsViewModel.getAllDailyDetails().observe(this, Observer { dailyDetailsList ->
            dailyDetailsRecyclerAdapter.submitList(dailyDetailsList)
        })
    }

    private fun getAllClientName()
    {
        dailyDetailsViewModel.getAllClient().observe(this, Observer {
            clientRecyclerAdapter.submitList(it)
        })
    }

    private fun getMutableLiveData()
    {
        dailyDetailsViewModel.getMutableLiveData().observe(this, Observer {
            if(it!=0) Log.e("notzero",it.toString())
        })
    }

    //for add client choose photo result
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == RESULT_OK)
        {
            if(requestCode == Requests.GALLERY_REQUEST_CODE)
            {
                data?.let {
                    addClientDialog.dismiss()
                    val addClientDialog = AddClientDialog(it.data!!)
                    addClientDialog.setStyle(DialogFragment.STYLE_NORMAL,R.style.DialogFragmentTheme)
                    addClientDialog.show(supportFragmentManager,"AddClient")
                }
            }
        }
    }

    override fun onClientNameItemClickListener(passesClientEntity: ClientEntity) {
        val intent = Intent(this,ProfileActivity::class.java)
        intent.putExtra("clientEntity",passesClientEntity)
        startActivity(intent)
    }

    override fun onClientNameItemLongClickListener(clientEntity: ClientEntity) {
        val alert = AlertDialog.Builder(this)
        alert.apply {
            setTitle("Delete Element")
            setMessage("Are You Sure For Delete This Element")
            setCancelable(false)
            setPositiveButton("YES") { _,_ ->
                dailyDetailsViewModel.deleteClient(clientEntity)
                Toast.makeText(this@MainActivity,"Item Deleted",Toast.LENGTH_SHORT).show()
            }
            setNegativeButton("NO") { _,_ ->
            }
        }.create().show()
    }

    override fun onDailyDetailsItemClickListener(passesDailyDetailsEntity: DailyDetailsEntity) {
        CoroutineScope(Dispatchers.Main).launch {
            if (passesDailyDetailsEntity.numberState == 1)
            {
                val intent = Intent(this@MainActivity, AddInvoiceActivity::class.java)
                val invoiceEntity = dailyDetailsViewModel.getInvoiceByDailyDetailsId(passesDailyDetailsEntity.id!!)
                intent.putExtra("isAdding", false)
                intent.putExtra("dailyDetailsEntity", passesDailyDetailsEntity)
                intent.putExtra("invoiceEntity", invoiceEntity)
                startActivity(intent)
            }
            else if (passesDailyDetailsEntity.numberState == 2)
            {
                val intent = Intent(this@MainActivity, AddPaymentActivity::class.java)
                val paymentEntity = dailyDetailsViewModel.getPaymentByDailyDetailsId(passesDailyDetailsEntity.id!!)
                intent.putExtra("isAdding", false)
                intent.putExtra("dailyDetailsEntity", passesDailyDetailsEntity)
                intent.putExtra("PaymentEntity", paymentEntity)
                startActivity(intent)
            }
            else if (passesDailyDetailsEntity.numberState == 3)
            {
                val intent = Intent(this@MainActivity, AddSpendActivity::class.java)
                val spendEntity = dailyDetailsViewModel.getSpendByDailyDetailsId(passesDailyDetailsEntity.id!!)
                intent.putExtra("isAdding", false)
                intent.putExtra("dailyDetailsEntity", passesDailyDetailsEntity)
                intent.putExtra("spendEntity", spendEntity)
                startActivity(intent)
            }
        }
    }

    override fun onDailyDetailsItemLongClickListener(passesDailyDetailsEntity: DailyDetailsEntity) {
        val alert = AlertDialog.Builder(this)
        alert.apply {
            setTitle("Delete Element")
            setMessage("Are You Sure For Delete This Element")
            setCancelable(false)
            setPositiveButton("YES") { _,_ ->
                dailyDetailsViewModel.deleteDailyDetails(passesDailyDetailsEntity)
                Toast.makeText(this@MainActivity,"Item Deleted",Toast.LENGTH_SHORT).show()
            }
            setNegativeButton("NO") { _,_ ->
            }
        }.create().show()
    }
}