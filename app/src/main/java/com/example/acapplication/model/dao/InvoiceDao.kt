package com.example.acapplication.model.dao

import androidx.room.*
import com.example.acapplication.model.entity.InvoiceEntity

@Dao
interface InvoiceDao {

    @Insert
    suspend fun insert(invoiceEntity: InvoiceEntity)

    @Delete
    suspend fun delete(invoiceEntity: InvoiceEntity)

    @Update
    suspend fun update(invoiceEntity: InvoiceEntity)

    @Query("SELECT * From invoice Where dailyDetailsId =:dailyDetailsId")
    suspend fun getInvoiceByDailyDetailsId(dailyDetailsId : Int) : InvoiceEntity

}