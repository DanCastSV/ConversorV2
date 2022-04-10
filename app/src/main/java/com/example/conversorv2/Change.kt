package com.example.conversorv2

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import kotlinx.android.synthetic.main.activity_change.*

class Change : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change)
        val Update:Button=btnActualizar

        Update.setOnClickListener {
            //manda los datos obtenidos
            val EUR: Float =etxEUR.text.toString().toFloat()
            val sharedPref = getSharedPreferences("MySharedPreferences", MODE_PRIVATE)
            val  myEdit = sharedPref.edit()
            myEdit.putFloat("EUR1",EUR)
            myEdit.commit()



         Toast.makeText(this,"Los cambios han sido guardado, para volver al conversor pulse atras",LENGTH_LONG).show()
        }


    }
}