package com.example.acapplication.model.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "spend", foreignKeys = [
    ForeignKey(
        entity = DailyDetailsEntity::class,
        parentColumns = ["id"],
        childColumns = ["dailyDetailsId"],
        onDelete = CASCADE)
    ])
class SpendEntity(
    @ColumnInfo(name = "details")
    var details : String,
    @ColumnInfo(name = "totalMoney")
    var totalMoney : Int,
    @ColumnInfo(name = "notice")
    var notice : String,
    @ColumnInfo(name = "dailyDetailsId")
    val dailyDetailsId : Int
) : Serializable {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id : Int? = null
}