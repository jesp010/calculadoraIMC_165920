package com.juan.solis.calculadoraIMC

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import com.juan.solis.calculadora.imc.R


class MainActivity : AppCompatActivity() {

    var estatura:Double =0.0
    var peso:Double =0.0
    var imc=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btnCalcular.setOnClickListener(){
            TV_Resultado.setText(calculaIMC().toString())
        }
    }

    fun calculaIMC():Double {
        estatura=(this.ET_Altura.text.toString()).toDouble()
        peso=(this.ET_Peso.text.toString()).toDouble()
        return peso/(estatura*estatura);

    }

}