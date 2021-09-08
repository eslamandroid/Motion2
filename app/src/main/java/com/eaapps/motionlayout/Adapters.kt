package com.eaapps.motionlayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView

class Adapters(private val datas: List<String>) : RecyclerView.Adapter<Adapters.ViViewHolder>() {

    private var horizontal = false

    fun down() {
        horizontal = true
        notifyDataSetChanged()
    }

    fun up() {
        horizontal = false
        notifyDataSetChanged()
    }

    inner class ViViewHolder(private val v: View) : RecyclerView.ViewHolder(v) {

        var linear: LinearLayout = v.findViewById<LinearLayout>(R.id.root)

        fun bind(position: Int) {

            if (horizontal) {
                linear.layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
                linear.orientation = LinearLayout.HORIZONTAL
            }else{
                linear.layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
                linear.orientation = LinearLayout.VERTICAL
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViViewHolder {
        return ViViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_cate, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return datas.size
    }
}