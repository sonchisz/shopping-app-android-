package com.example.shopping_app.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.shopping_app.Activity.DetailActivity
import com.example.shopping_app.Domain.ItemsModel
import com.example.shopping_app.databinding.ViewholderPopularBinding

class PopularAdapter(val items:MutableList<ItemsModel>) :
        RecyclerView.Adapter<PopularAdapter.Viewholder>() {
                lateinit var context: Context
        class Viewholder (val binding: ViewholderPopularBinding):RecyclerView.ViewHolder(binding.root)

        override fun onCreateViewHolder(
                parent: ViewGroup,
                viewType: Int
        ): PopularAdapter.Viewholder {
                context=parent.context
                val binding=ViewholderPopularBinding.inflate(LayoutInflater.from(context),parent,false)
                return Viewholder(binding)
        }

        override fun onBindViewHolder(holder: PopularAdapter.Viewholder, position: Int) {
                holder.binding.titleTxt.text=items[position].title
                holder.binding.priceTxt.text="$"+items[position].price.toString()

                Glide.with(context)
                        .load(items[position].thumbnail)
                        .into(holder.binding.pic)


                holder.binding.root.setOnClickListener {
                        val intent= Intent(context, DetailActivity::class.java)
                        intent.putExtra("object",items[position])
                        context.startActivity(intent)
                }
        }

        override fun getItemCount(): Int =items.size

}