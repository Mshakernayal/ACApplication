package com.example.acapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.acapplication.model.entity.ClientEntity
import com.example.acapplication.model.entity.DailyDetailsEntity
import com.example.acapplication.model.entity.InvoiceEntity
import com.example.acapplication.repository.ClientRepository
import com.example.acapplication.repository.DailyDetailsRepository
import com.example.acapplication.repository.InvoiceRepository
import kotlinx.coroutines.launch

class InvoiceViewModel(val invoiceRepository: InvoiceRepository,
                        val dailyDetailsRepository: DailyDetailsRepository,
                        val clientRepository: ClientRepository) : ViewModel() {

    fun insert(invoiceEntity: InvoiceEntity) = viewModelScope.launch {
        invoiceRepository.insert(invoiceEntity)
    }

    fun delete(invoiceEntity: InvoiceEntity) = viewModelScope.launch {
        invoiceRepository.delete(invoiceEntity)
    }

    fun update(invoiceEntity: InvoiceEntity) = viewModelScope.launch {
        invoiceRepository.update(invoiceEntity)
    }

    fun insertDailyDetails(dailyDetailsEntity: DailyDetailsEntity) = viewModelScope.launch {
        dailyDetailsRepository.insert(dailyDetailsEntity)
    }

    fun deleteDailyDetails(dailyDetailsEntity: DailyDetailsEntity) = viewModelScope.launch {
        dailyDetailsRepository.delete(dailyDetailsEntity)
    }

    fun updateDailyDetails(dailyDetailsEntity: DailyDetailsEntity) = viewModelScope.launch {
        dailyDetailsRepository.update(dailyDetailsEntity)
    }

    fun getLastDailyDetailsId() : MutableLiveData<Int> = dailyDetailsRepository.getLastDailyDetailsId()

    suspend fun getMaxDailyDetails() : Int = dailyDetailsRepository.getMaxDailyDetails()

    suspend fun getAllNameClient() : List<String> = clientRepository.getAllNameClient()

    suspend fun getIdClientByName(name : String) : Int = clientRepository.getIdClientByName(name)
}