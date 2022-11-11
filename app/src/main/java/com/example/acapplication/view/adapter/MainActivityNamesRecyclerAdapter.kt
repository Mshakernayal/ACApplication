package com.example.acapplication.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.acapplication.R
import com.example.acapplication.model.entity.ClientEntity
import com.example.acapplication.util.interfaces.OnClientNameClickListener
import kotlinx.android.synthetic.main.item_recycler_main_activity_names.view.*

class MainActivityNamesRecyclerAdapter(val OnClientNameClickListener: OnClientNameClickListener)
    : ListAdapter<ClientEntity,MainActivityNamesRecyclerAdapter.MainActivityNamesViewHolder>(diffUtil) {

    inner class MainActivityNamesViewHolder(view : View) : RecyclerView.ViewHolder(view)

    object diffUtil : DiffUtil.ItemCallback<ClientEntity>()
    {
        override fun areItemsTheSame(
            oldItem: ClientEntity,
            newItem: ClientEntity
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: ClientEntity,
            newItem: ClientEntity
        ): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainActivityNamesViewHolder {
        return MainActivityNamesViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_main_activity_names,parent,false))
    }

    override fun onBindViewHolder(holder: MainActivityNamesViewHolder, position: Int) {
        val clientEntity = getItem(position)
        val animation = AnimationUtils.loadAnimation(holder.itemView.context,android.R.anim.slide_in_left)

        holder.itemView.apply {
            startAnimation(animation)
            Glide.with(holder.itemView.context).load(clientEntity.image).into(imgItemRecyclerActivityMainNameImage)
            txtItemRecyclerMainActivityNameName.text = clientEntity.name

            setOnClickListener {
                OnClientNameClickListener.onClientNameItemClickListener(clientEntity)
            }

            setOnLongClickListener {
                OnClientNameClickListener.onClientNameItemLongClickListener(clientEntity)
                true
            }
        }
    }
}