package com.example.acapplication.repository

import androidx.lifecycle.MutableLiveData
import com.example.acapplication.model.database.AcDataBase
import com.example.acapplication.model.entity.PaymentEntity

class PaymentRepository(val dataBase: AcDataBase) {

    suspend fun insert(paymentEntity: PaymentEntity)
    {
        dataBase.getPaymentDao().insert(paymentEntity)
    }

    suspend fun delete(paymentEntity: PaymentEntity)
    {
        dataBase.getPaymentDao().delete(paymentEntity)
    }

    suspend fun update(paymentEntity: PaymentEntity)
    {
        dataBase.getPaymentDao().update(paymentEntity)
    }

    suspend fun getPaymentByDailyDetailsId(dailyDetailsId : Int) : PaymentEntity
    = dataBase.getPaymentDao().getPaymentByDailyDetailsId(dailyDetailsId)
}