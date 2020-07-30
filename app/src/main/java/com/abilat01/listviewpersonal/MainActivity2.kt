package com.abilat01.listviewpersonal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val test = arrayListOf<Eximple>()
        test.add(Eximple("name","test",R.drawable.mac))
        test.add(Eximple("name","test2",R.drawable.executive))
        test.add(Eximple("name","test3",R.drawable.executive))
        test.add(Eximple("name","test4",R.drawable.executive))
        test.add(Eximple("name","test5",R.drawable.executive))
        val id = intent.getIntExtra("id",0)

    number_product.text = test[id].description
    number_oper.text = test[id].info
    image_product.setImageResource(test[id].imege_info)




    }
}