package com.example.a1_comp_3606

import android.content.pm.PackageManager
import android.os.Build.VERSION.SDK_INT
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat


class MainActivity : AppCompatActivity() {
    private val requestCode = 1234
    private var hasPermissions = false





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val button:Button=findViewById(R.id.Wifibutton)
        button.setOnClickListener {
            val Wifiviewmenu=LayoutInflater.from(this).inflate(R.layout.wifimenu,null)

            val WifiBuilder=AlertDialog.Builder(this)
                .setView(Wifiviewmenu)
                .setTitle("Menu for Wifi")

            WifiBuilder.show()






            Toast.makeText(this,"button 1 clicked", Toast.LENGTH_SHORT).show()

            //this is code to change the visibility of  The other section of the app
            val one: LinearLayout =findViewById(R.id.Listing_Info)
            one.setVisibility(View.VISIBLE)

            val two: LinearLayout =findViewById(R.id.Marketplace)
            if(two.visibility ==LinearLayout.GONE)
                two.setVisibility(View.VISIBLE)
            else
                two.setVisibility(View.GONE)
        }








    }



}


