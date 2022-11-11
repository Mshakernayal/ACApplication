package com.example.acapplication.model.entity

import android.net.Uri
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "dailyDetails", foreignKeys = [
    ForeignKey(
        entity = ClientEntity::class,
        parentColumns = ["id"],
        childColumns = ["clientId"],
        onDelete = CASCADE
    )
])
data class DailyDetailsEntity(

    @ColumnInfo(name = "image")
    var image : String?,
    @ColumnInfo(name = "name")
    var name : String,
    @ColumnInfo(name = "totalMoney")
    var totalMoney : Int,
    @ColumnInfo(name = "barcodeNo")
    var barcodeNo : String,
    @ColumnInfo(name = "state")
    val state : String,
    @ColumnInfo(name = "numberState")
    val numberState : Int,
    @ColumnInfo(name = "clientId")
    val clientId : Int?
) : Serializable {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id : Int? = null
}