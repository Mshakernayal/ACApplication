package com.example.acapplication.view.adapter

import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.acapplication.R
import com.example.acapplication.model.entity.DailyDetailsEntity
import com.example.acapplication.util.interfaces.OnDailyDetailsItemClickListener
import kotlinx.android.synthetic.main.item_recycler_activity_main_details.view.*

class MainActivityDailyDetailsRecyclerAdapter(val onDailyDetailsItemClickListener: OnDailyDetailsItemClickListener)
    : ListAdapter<DailyDetailsEntity,MainActivityDailyDetailsRecyclerAdapter.MainActivityDetailsViewHolder>(diffUtil){

    inner class MainActivityDetailsViewHolder(view : View) : RecyclerView.ViewHolder(view)

    object diffUtil : DiffUtil.ItemCallback<DailyDetailsEntity>()
    {
        override fun areItemsTheSame(oldItem: DailyDetailsEntity, newItem: DailyDetailsEntity): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: DailyDetailsEntity, newItem: DailyDetailsEntity): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MainActivityDetailsViewHolder {
        return MainActivityDetailsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_activity_main_details,parent,false))
    }

    override fun onBindViewHolder(holder: MainActivityDetailsViewHolder, position: Int) {
        val dailyDetailsEntity = getItem(position)
        val animation = AnimationUtils.loadAnimation(holder.itemView.context,android.R.anim.slide_in_left)

        holder.itemView.apply {
            startAnimation(animation)

            Glide.with(holder.itemView.context).load(dailyDetailsEntity.image!!).into(imgItemRecyclerMainActivityDetailsImage)
            txtItemRecyclerMainActivityDetailsName.text = dailyDetailsEntity.name
            txtItemRecyclerMainActivityDetailsBarcode.text = dailyDetailsEntity.barcodeNo
            txtItemRecyclerMainActivityDetailsTotalMoney.text = dailyDetailsEntity.totalMoney.toString()
            txtItemRecyclerMainActivityDetailsState.text = dailyDetailsEntity.state

            if(txtItemRecyclerMainActivityDetailsState.text.toString() == "payfrom"||txtItemRecyclerMainActivityDetailsState.text.toString() == "invoon")
            {
                txtItemRecyclerMainActivityDetailsState.setTextColor(Color.parseColor("#FF344A"))
            }

            setOnClickListener {
                onDailyDetailsItemClickListener.onDailyDetailsItemClickListener(dailyDetailsEntity)
            }

            setOnLongClickListener {
                onDailyDetailsItemClickListener.onDailyDetailsItemLongClickListener(dailyDetailsEntity)
                true
            }
        }

    }
}