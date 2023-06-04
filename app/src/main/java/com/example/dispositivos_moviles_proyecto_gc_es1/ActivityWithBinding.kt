package com.example.dispositivos_moviles_proyecto_gc_es1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dispositivos_moviles_proyecto_gc_es1.databinding.ActivityWithBindingBinding

class ActivityWithBinding : AppCompatActivity() {

    private lateinit var binding: ActivityWithBindingBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityWithBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
    }

    /*
    fun initClass{

    }
    */


}