package com.example.acapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.acapplication.model.entity.ClientEntity
import com.example.acapplication.model.entity.DailyDetailsEntity
import com.example.acapplication.repository.ClientRepository
import com.example.acapplication.repository.DailyDetailsRepository
import kotlinx.coroutines.launch

class ClientViewModel(val clientRepository: ClientRepository,
                        val dailyDetailsRepository: DailyDetailsRepository) : ViewModel() {

    fun insertClientName(clientEntity: ClientEntity) = viewModelScope.launch {
        clientRepository.insert(clientEntity)
    }

    fun deleteClientName(clientEntity: ClientEntity) = viewModelScope.launch {
        clientRepository.delete(clientEntity)
    }

    fun updateClientName(clientEntity: ClientEntity) = viewModelScope.launch {
        clientRepository.update(clientEntity)
    }

    fun getAllClient() : LiveData<List<ClientEntity>> = clientRepository.getAllClient()

    fun getMutableLiveData() : MutableLiveData<Int> = clientRepository.getMutableLiveData()

    fun getAllDailyDetailsByByClientId(clientId : Int) : LiveData<List<DailyDetailsEntity>> = dailyDetailsRepository.getAllDailyDetailsByClientId(clientId)
}