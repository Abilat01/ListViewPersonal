package com.abilat01.listviewpersonal

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.product_item.view.*

class ProductAdapter (private val mContext: Context, private val listProduct: List<Product>) :
    ArrayAdapter<Product>(mContext, 0, listProduct) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
val layout = LayoutInflater.from(mContext).inflate(R.layout.product_item, parent, false)

        val productIn = listProduct[position]

        layout.tv_main.text = productIn.namber
        layout.tv_money.text = "$${productIn.precio}"
        layout.imageView_main.setImageResource(productIn.image)

        return layout
    }
}