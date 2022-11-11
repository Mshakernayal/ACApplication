package com.example.acapplication.model.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.acapplication.model.entity.ClientEntity

@Dao
interface ClientDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(clientEntity: ClientEntity)

    @Delete
    suspend fun delete(clientEntity: ClientEntity)

    @Update
    suspend fun update(clientEntity: ClientEntity)

    @Query("SELECT * From client")
    fun getAllClient() : LiveData<List<ClientEntity>>

    @Query("SELECT name From client")
    suspend fun getAllNameClient() : List<String>

    @Query("SELECT Max(id) From client")
    suspend fun getMaxId() : Int

    @Query("SELECT id From client Where name =:name")
    suspend fun getIdClientByName(name : String) : Int
}