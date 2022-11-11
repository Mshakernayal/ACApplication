package com.example.acapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.acapplication.model.entity.DailyDetailsEntity
import com.example.acapplication.model.entity.SpendEntity
import com.example.acapplication.repository.ClientRepository
import com.example.acapplication.repository.DailyDetailsRepository
import com.example.acapplication.repository.SpendRepository
import kotlinx.coroutines.launch

class AddSpendViewModel(val spendRepository: SpendRepository,
                        val dailyDetailsRepository: DailyDetailsRepository,
                        val clientRepository: ClientRepository) : ViewModel() {

    fun insertSpend(spendEntity: SpendEntity) = viewModelScope.launch {
        spendRepository.insert(spendEntity)
    }

    fun deleteSpend(spendEntity: SpendEntity) = viewModelScope.launch {
        spendRepository.delete(spendEntity)
    }

    fun updateSpend(spendEntity: SpendEntity) = viewModelScope.launch {
        spendRepository.update(spendEntity)
    }

    suspend fun getSpendByDailyDetailsId(dailyDetailsId : Int) : SpendEntity = spendRepository.getSpendByDailyDetailsId(dailyDetailsId)

    fun insertDailyDetails(dailyDetailsEntity: DailyDetailsEntity) = viewModelScope.launch {
        val id = dailyDetailsRepository.insert(dailyDetailsEntity)
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
}