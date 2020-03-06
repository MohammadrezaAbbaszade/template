package com.example.pinket.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pinket.R
import kotlinx.android.synthetic.main.products_items.view.*

class ProductRecyclerView(val context: Context, var productList: List<Int>) :
    RecyclerView.Adapter<ProductRecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.products_items, parent, false)
        val viewHolder =
            ViewHolder(
                view,
                context
            )
        return viewHolder
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(productList.get(position))
    }


    class ViewHolder(val view: View, val context: Context) : RecyclerView.ViewHolder(view) {

        fun bind(image:Int){
        with(view){
            list_newest_product_image_view.setBackgroundResource(image)
        }
        }
    }


}