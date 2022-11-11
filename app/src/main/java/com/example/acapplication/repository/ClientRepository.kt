package com.example.acapplication.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.acapplication.model.database.AcDataBase
import com.example.acapplication.model.entity.ClientEntity

class ClientRepository(val dataBase : AcDataBase) {

    private var mutableLiveData = MutableLiveData<Int>()

    suspend fun insert(clientEntity: ClientEntity)
    {
        mutableLiveData.postValue(0)
        dataBase.getClientDao().insert(clientEntity)
        val id = dataBase.getClientDao().getMaxId()
        mutableLiveData.postValue(id)
    }

    suspend fun delete(clientEntity: ClientEntity)
    {
        dataBase.getClientDao().delete(clientEntity)
    }

    suspend fun update(clientEntity: ClientEntity)
    {
        dataBase.getClientDao().update(clientEntity)
    }

    fun getAllClient() : LiveData<List<ClientEntity>> = dataBase.getClientDao().getAllClient()

    suspend fun getAllNameClient() : List<String> = dataBase.getClientDao().getAllNameClient()

    fun getMutableLiveData() : MutableLiveData<Int> = mutableLiveData

    suspend fun getIdClientByName(name : String) : Int = dataBase.getClientDao().getIdClientByName(name)
}