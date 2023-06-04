package com.example.dispositivos_moviles_proyecto_gc_es1

import android.annotation.SuppressLint
import android.app.Activity
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import com.example.dispositivos_moviles_proyecto_gc_es1.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("MissingInflated")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // No es necesario invocarlo por el ciclo de vida de un Activity
        //onStart()

        // Se invoca el metodo creado para realizar funcionalidades especificas
        //initClass()

        // ViewBinding
        //var button2 = binding.button2

        // FindViewByID
        var button2 = findViewById<ImageButton>(R.id.imageButton2)
        var txtBuscar = findViewById<TextView>(R.id.buscar)

        // Con ViewBinding
        /*binding.button2.setOnClickListener{
            binding.txtBuscar.text = "El evento se ha ejecutado"

            Toast.makeText(this, "Hola mundo",
                Toast.LENGTH_SHORT
            ).show()

            Snackbar.make(
                binding.button2,
                "Este es otro mensaje",
                Snackbar.LENGTH_SHORT
            ).setBackgroundTint(Color.BLACK).show()
        }*/

        // con FindViewById
        //button2.text = "INGRESAR"
        button2.setOnClickListener{
            txtBuscar.text = "El evento se ha ejecutado"


            Snackbar.make(
                button2,
                "Holi",
                Snackbar.LENGTH_SHORT
            ).setBackgroundTint(Color.GREEN).show()
        }

    }

    // Para iniciar la funcion y evitar problemas con la inicializacion del Binding
    // Se ejecuta inmediatamente despues del onCreate
    override fun onStart() {
        super.onStart()
        initClass()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    // Podemos crear nuestras funcionalidades en una funcion apartada e invocarla en el onCreate
    fun initClass() {
        binding.button2.setOnClickListener {
            binding.buscar.text = "El evento se ha ejecutado"


            Toast.makeText(
                this, "Hola mundo",
                Toast.LENGTH_SHORT
            ).show()

        }

    }
}

