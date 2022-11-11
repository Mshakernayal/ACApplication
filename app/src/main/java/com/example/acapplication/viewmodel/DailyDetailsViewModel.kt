package com.example.acapplication.viewmodel

import android.view.ViewParent
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.acapplication.model.entity.ClientEntity
import com.example.acapplication.model.entity.DailyDetailsEntity
import com.example.acapplication.model.entity.PaymentEntity
import com.example.acapplication.repository.*
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityRetainedComponentBuilder
import kotlinx.coroutines.launch

class DailyDetailsViewModel(
    val dailyDetailsRepository: DailyDetailsRepository,
    val clientRepository: ClientRepository,
    val invoiceRepository: InvoiceRepository,
    val paymentRepository: PaymentRepository,
    val spendRepository: SpendRepository) : ViewModel() {

    fun insertDailyDetails(dailyDetailsEntity: DailyDetailsEntity) = viewModelScope.launch {
        dailyDetailsRepository.insert(dailyDetailsEntity)
    }

    fun deleteDailyDetails(dailyDetailsEntity: DailyDetailsEntity) = viewModelScope.launch {
        dailyDetailsRepository.delete(dailyDetailsEntity)
    }

    fun updateDailyDetails(dailyDetailsEntity: DailyDetailsEntity) = viewModelScope.launch {
        dailyDetailsRepository.update(dailyDetailsEntity)
    }

    fun getAllDailyDetails() : LiveData<List<DailyDetailsEntity>> = dailyDetailsRepository.getAllDailyDetails()

    suspend fun getInvoiceByDailyDetailsId(dailyDetailsId : Int) = invoiceRepository.getInvoiceByDailyDetailsId(dailyDetailsId)

    suspend fun getSpendByDailyDetailsId(dailyDetailsId : Int) = spendRepository.getSpendByDailyDetailsId(dailyDetailsId)

    fun getAllClient() : LiveData<List<ClientEntity>> = clientRepository.getAllClient()

    fun deleteClient(clientEntity: ClientEntity) = viewModelScope.launch {
        clientRepository.delete(clientEntity)
    }

    fun getMutableLiveData() : MutableLiveData<Int> = clientRepository.getMutableLiveData()

    suspend fun getPaymentByDailyDetailsId(dailyDetailsId : Int) : PaymentEntity = paymentRepository.getPaymentByDailyDetailsId(dailyDetailsId)
}