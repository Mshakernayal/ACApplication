package com.example.acapplication.repository

import com.example.acapplication.model.database.AcDataBase
import com.example.acapplication.model.entity.InvoiceEntity

class InvoiceRepository(val dataBase: AcDataBase) {

    suspend fun insert(invoiceEntity: InvoiceEntity)
    {
        dataBase.getInvoiceDao().insert(invoiceEntity)
    }

    suspend fun delete(invoiceEntity: InvoiceEntity)
    {
        dataBase.getInvoiceDao().delete(invoiceEntity)
    }

    suspend fun update(invoiceEntity: InvoiceEntity)
    {
        dataBase.getInvoiceDao().update(invoiceEntity)
    }

    suspend fun getInvoiceByDailyDetailsId(dailyDetailsId : Int) = dataBase.getInvoiceDao().getInvoiceByDailyDetailsId(dailyDetailsId)
}