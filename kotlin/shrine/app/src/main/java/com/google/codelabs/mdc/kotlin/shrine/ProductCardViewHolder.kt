package com.google.codelabs.mdc.kotlin.shrine

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.toolbox.NetworkImageView

class ProductCardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val productImage = itemView.findViewById<NetworkImageView>(R.id.product_image)
    val productTitle = itemView.findViewById<TextView>(R.id.product_title)
    val productPrice = itemView.findViewById<TextView>(R.id.product_price)
}
