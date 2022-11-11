package com.example.acapplication.util.interfaces

import com.example.acapplication.model.entity.DailyDetailsEntity

interface OnDailyDetailsItemClickListener {

    fun onDailyDetailsItemClickListener(passesDailyDetailsEntity: DailyDetailsEntity)
    fun onDailyDetailsItemLongClickListener(passesDailyDetailsEntity: DailyDetailsEntity)
}