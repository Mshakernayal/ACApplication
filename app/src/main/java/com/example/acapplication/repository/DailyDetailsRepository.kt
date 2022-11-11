package com.example.acapplication.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.acapplication.model.dao.DailyDetailsDao
import com.example.acapplication.model.database.AcDataBase
import com.example.acapplication.model.entity.DailyDetailsEntity

class DailyDetailsRepository (val dataBase : AcDataBase){

    private var lastDailyDetailsId: MutableLiveData<Int> = MutableLiveData()

    suspend fun insert(dailyDetailsEntity: DailyDetailsEntity)
    {
        lastDailyDetailsId.postValue(0)
        dataBase.getDailyDetailsDao().insert(dailyDetailsEntity)
        val id = dataBase.getDailyDetailsDao().getLastDailyDetails()
        lastDailyDetailsId.postValue(id)
    }

    suspend fun delete(dailyDetailsEntity: DailyDetailsEntity)
    {
        dataBase.getDailyDetailsDao().delete(dailyDetailsEntity)
    }

    suspend fun update(dailyDetailsEntity: DailyDetailsEntity)
    {
        dataBase.getDailyDetailsDao().update(dailyDetailsEntity)
    }

    fun getAllDailyDetails() : LiveData<List<DailyDetailsEntity>> = dataBase.getDailyDetailsDao().getAllDailyDetails()

    fun getLastDailyDetailsId() : MutableLiveData<Int> = lastDailyDetailsId

    suspend fun getMaxDailyDetails() : Int = dataBase.getDailyDetailsDao().getLastDailyDetails()

    fun getAllDailyDetailsByClientId(clientId : Int) : LiveData<List<DailyDetailsEntity>> = dataBase.getDailyDetailsDao().getAllDailyDetailsByClientId(clientId)
}