package com.example.acapplication.util.interfaces

import com.example.acapplication.model.entity.ClientEntity
import com.example.acapplication.model.entity.DailyDetailsEntity

interface OnClientNameClickListener {

    fun onClientNameItemClickListener(clientEntity: ClientEntity)

    fun onClientNameItemLongClickListener(clientEntity: ClientEntity)
}