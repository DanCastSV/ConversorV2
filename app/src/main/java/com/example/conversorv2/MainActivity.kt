package com.example.conversorv2

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val change:RadioButton=rbChange
        change.setOnClickListener {
            val intent = Intent(this, Change::class.java).apply {

            }
            startActivity(intent)


        }
        val Convertir:Button=  btnConvertir

        Convertir.setOnClickListener {
            val change:RadioButton=rbChange
            val Hold:RadioButton=rbHold
            val Resultado:TextView=txtResultado
            if(Hold.isChecked){
                sinCambios()
            }
            else if (change.isChecked){
                Cambios()
            }






        }




    }

    private fun sinCambios(){
        val Dollar:Double=etxDollar.text.toString().toDouble()
        val Resultado:TextView=txtResultado
        var EUR:Double=0.90

        val Total: Double=Dollar*EUR

        Resultado.text="$Total €"








    }

    private fun Cambios(){
        val Dollar: Float =etxDollar.text.toString().toFloat()
        val Resultado:TextView=txtResultado
        val sharedPref = getSharedPreferences("MySharedPreferences", MODE_PRIVATE)
        val divisa = sharedPref.getFloat("EUR1", 0.0F)


        val Total: Float =Dollar*divisa

        Resultado.text="$Total €"

    }
}