package com.example.acapplication.model.entity

import androidx.room.*
import androidx.room.ForeignKey.CASCADE
import java.io.Serializable

@Entity(tableName = "invoice", foreignKeys =[
    ForeignKey(
        entity = DailyDetailsEntity::class,
        parentColumns = ["id"],
        childColumns = ["dailyDetailsId"],
        onDelete = CASCADE
    )
])
class InvoiceEntity(
    @ColumnInfo(name = "name")
    var name : String ,
    @ColumnInfo(name = "itemType")
    var itemType : String,
    @ColumnInfo(name = "number")
    var number : Int,
    @ColumnInfo(name = "meter")
    var meter : Int,
    @ColumnInfo(name = "price")
    var price : Int,
    @ColumnInfo(name = "spend")
    var spend : Int?,
    @ColumnInfo(name = "notice")
    var notice : String,
    @ColumnInfo(name = "invoiceState")
    val invoiceState : Char,
    @ColumnInfo(name = "dailyDetailsId")
    val dailyDetailsId : Int
) : Serializable{
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id : Int? = null
}