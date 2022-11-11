package com.example.acapplication.model.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.acapplication.model.entity.PaymentEntity

@Dao
interface PaymentDao {
    @Insert
    suspend fun insert(paymentEntity: PaymentEntity)

    @Delete
    suspend fun delete(paymentEntity: PaymentEntity)

    @Update
    suspend fun update(paymentEntity: PaymentEntity)

    @Query("SELECT * From payment Where dailyDetailsId =:dailyDetailsId")
    suspend fun getPaymentByDailyDetailsId(dailyDetailsId : Int) : PaymentEntity
}