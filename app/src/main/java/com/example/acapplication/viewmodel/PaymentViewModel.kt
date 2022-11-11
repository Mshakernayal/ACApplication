package com.example.acapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.acapplication.model.entity.DailyDetailsEntity
import com.example.acapplication.model.entity.PaymentEntity
import com.example.acapplication.repository.ClientRepository
import com.example.acapplication.repository.DailyDetailsRepository
import com.example.acapplication.repository.PaymentRepository
import kotlinx.coroutines.launch

class PaymentViewModel(val paymentRepository: PaymentRepository,
                        val clientRepository: ClientRepository,
                        val dailyDetailsRepository: DailyDetailsRepository) : ViewModel() {

    fun insert(paymentEntity: PaymentEntity) = viewModelScope.launch {
        paymentRepository.insert(paymentEntity)
    }

    fun delete(paymentEntity: PaymentEntity) = viewModelScope.launch {
        paymentRepository.delete(paymentEntity)
    }

    fun update(paymentEntity: PaymentEntity) = viewModelScope.launch {
        paymentRepository.update(paymentEntity)
    }

    suspend fun getPaymentByDailyDetailsId(dailyDetailsId : Int) : PaymentEntity = paymentRepository.getPaymentByDailyDetailsId(dailyDetailsId)

    suspend fun getAllNameClient() : List<String> = clientRepository.getAllNameClient()

    fun getMutableLiveData() : MutableLiveData<Int> = clientRepository.getMutableLiveData()

    suspend fun getIdClientByName(name : String) : Int = clientRepository.getIdClientByName(name)

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

}