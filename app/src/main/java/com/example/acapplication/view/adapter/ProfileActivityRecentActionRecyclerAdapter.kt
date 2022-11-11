package com.example.acapplication.view.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.acapplication.R
import com.example.acapplication.model.entity.DailyDetailsEntity
import kotlinx.android.synthetic.main.activity_profile.view.*
import kotlinx.android.synthetic.main.item_recycler_activity_main_details.view.*

class ProfileActivityRecentActionRecyclerAdapter : ListAdapter<DailyDetailsEntity,ProfileActivityRecentActionRecyclerAdapter.ProfileActivityRecentActionViewHolder>(diffUtil) {

    inner class ProfileActivityRecentActionViewHolder(view : View) : RecyclerView.ViewHolder(view)

    object diffUtil : DiffUtil.ItemCallback<DailyDetailsEntity>()
    {
        override fun areItemsTheSame(
            oldItem: DailyDetailsEntity,
            newItem: DailyDetailsEntity
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: DailyDetailsEntity,
            newItem: DailyDetailsEntity
        ): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProfileActivityRecentActionViewHolder {
        return ProfileActivityRecentActionViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_activity_main_details,parent,false))
    }

    override fun onBindViewHolder(holder: ProfileActivityRecentActionViewHolder, position: Int) {
        val dailyDetailsEntity = getItem(position)

        holder.itemView.apply {

            Glide.with(holder.itemView.context).load(dailyDetailsEntity.image).into(imgItemRecyclerMainActivityDetailsImage)
            txtItemRecyclerMainActivityDetailsName.text = dailyDetailsEntity.name
            txtItemRecyclerMainActivityDetailsTotalMoney.text = dailyDetailsEntity.totalMoney.toString()
            txtItemRecyclerMainActivityDetailsBarcode.text = dailyDetailsEntity.barcodeNo
            txtItemRecyclerMainActivityDetailsState.text = dailyDetailsEntity.state
        }
    }
}