package com.example.acapplication.model.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "payment",
        foreignKeys =
        [
            ForeignKey(
                entity = DailyDetailsEntity::class,
                parentColumns = ["id"],
                childColumns = ["dailyDetailsId"],
                onDelete = CASCADE
            )
        ])
class PaymentEntity(
    @ColumnInfo(name = "name")
    var name : String,
    @ColumnInfo(name = "totalMoney")
    var totalMoney : Int,
    @ColumnInfo(name = "notice")
    var notice : String,
    @ColumnInfo(name = "dailyDetailsId")
    val clientId : Int,
    @ColumnInfo(name = "PaymentState")
    val paymentState : Char
) : Serializable {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id : Int? = null
}