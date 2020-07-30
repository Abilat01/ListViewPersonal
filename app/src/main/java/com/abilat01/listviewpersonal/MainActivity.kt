package com.abilat01.listviewpersonal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val product = Product("Компьютер", 150.0, "Комьпьютер 16RAM? 2GB", R.drawable.mac)
        val product2 = Product("Машина", 950.0, "Спортиный автомобиль", R.drawable.executive)
        val product3 = Product("Крутая машина", 950.0, "Спортиный автомобиль", R.drawable.hqdefault)
        val product4 = Product("Крутой комп", 950.0, "Спортиный автомобиль", R.drawable.komp)

        val listProduct = listOf(product, product2, product3, product4)

        val adapter = ProductAdapter(this, listProduct)

        list_view.adapter = adapter

        list_view.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("product", listProduct[position])
            startActivity(intent)
        }
    }
}