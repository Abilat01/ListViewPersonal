package com.abilat01.listviewpersonal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val product = Product ("Компьютер", 150.0, "Комьпьютер 16RAM? 2GB", R.drawable.mac)
        val product2 = Product ("Машина", 950.0, "Спортиный автомобиль", R.drawable.hqdefault)

        val listProduct = listOf(product, product2)

        val adapter = ProductAdapter(this, listProduct)

        list_view.adapter = adapter
    }
}