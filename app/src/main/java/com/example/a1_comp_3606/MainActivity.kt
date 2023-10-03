package com.example.a1_comp_3606

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import java.time.Duration

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button=findViewById(R.id.Wifibutton)
        button.setOnClickListener { this }

        val SellerInfoLayout: LinearLayout=findViewById(R.id.Listing_Info)

    }



    fun buttonInfoPop(v:View)
     {
         Toast.makeText(this, "Button pressed",Toast.LENGTH_LONG).show()


     }



}