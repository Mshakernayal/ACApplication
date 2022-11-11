package com.example.acapplication.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.acapplication.model.dao.*
import com.example.acapplication.model.entity.*

@Database(entities = [ClientEntity::class,
                    DailyDetailsEntity::class,
                    InvoiceEntity::class,
                    PaymentEntity::class,
                     SpendEntity::class], version = 1, exportSchema = false)
abstract class AcDataBase : RoomDatabase() {

    abstract fun getClientDao() : ClientDao
    abstract fun getDailyDetailsDao() : DailyDetailsDao
    abstract fun getInvoiceDao() : InvoiceDao
    abstract fun getPaymentDao() : PaymentDao
    abstract fun getSpendDao() : SpendDao
}