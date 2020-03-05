package com.example.pinket

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.smarteist.autoimageslider.SliderViewAdapter
import kotlinx.android.synthetic.main.slider_images.view.*

class SliderAdapter(val context: Context, var imageViews: List<Int>) :
    SliderViewAdapter<SliderAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup?): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.slider_images, parent, false)
        val viewHolder = ViewHolder(view, context)
        return viewHolder
    }

    override fun getCount(): Int {
        return imageViews.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder?, position: Int) {
        viewHolder?.bind(imageViews.get(position))
    }


    class ViewHolder(var view: View, val context: Context) : SliderViewAdapter.ViewHolder(view) {

        fun bind(image:Int){
            with(view){
                images.setBackgroundResource(image)
            }
        }
    }
}