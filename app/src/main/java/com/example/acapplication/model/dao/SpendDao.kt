package com.example.acapplication.model.dao

import androidx.room.*
import com.example.acapplication.model.entity.SpendEntity

@Dao
interface SpendDao
{
    @Insert
    suspend fun insert(spendEntity: SpendEntity)

    @Delete
    suspend fun delete(spendEntity: SpendEntity)

    @Update
    suspend fun update(spendEntity: SpendEntity)

    @Query("SELECT * From spend Where dailyDetailsId =:dailyDetailsId")
    suspend fun getSpendByDailyDetailsId(dailyDetailsId : Int) : SpendEntity
}
