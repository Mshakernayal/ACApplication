package com.example.acapplication.model.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.acapplication.model.entity.DailyDetailsEntity

@Dao
interface DailyDetailsDao {

    @Insert
    suspend fun insert(dailyDetailsEntity: DailyDetailsEntity)

    @Delete
    suspend fun delete(dailyDetailsEntity: DailyDetailsEntity)

    @Update
    suspend fun update(dailyDetailsEntity: DailyDetailsEntity)

    @Query("SELECT * From dailyDetails")
    fun getAllDailyDetails() : LiveData<List<DailyDetailsEntity>>

    @Query("SELECT Max(id) From dailyDetails")
    suspend fun getLastDailyDetails() : Int

    @Query("SELECT * From dailyDetails where clientId =:clientId")
    fun getAllDailyDetailsByClientId(clientId : Int) : LiveData<List<DailyDetailsEntity>>
}