package com.example.acapplication.repository

import com.example.acapplication.model.database.AcDataBase
import com.example.acapplication.model.entity.SpendEntity

class SpendRepository(val dataBase: AcDataBase) {

    suspend fun insert(spendEntity: SpendEntity)
    {
        dataBase.getSpendDao().insert(spendEntity)
    }

    suspend fun delete(spendEntity: SpendEntity)
    {
        dataBase.getSpendDao().delete(spendEntity)
    }

    suspend fun update(spendEntity: SpendEntity)
    {
        dataBase.getSpendDao().update(spendEntity)
    }

    suspend fun getSpendByDailyDetailsId(dailyDetailsId : Int) : SpendEntity
    = dataBase.getSpendDao().getSpendByDailyDetailsId(dailyDetailsId)
}