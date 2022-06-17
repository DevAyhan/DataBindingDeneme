package com.example.databindingdeneme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.databindingdeneme.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var design:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        design = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val name = design.editTextName.text
        val sirname = design.editTextSirname.text

        design.buttonLogin.setOnClickListener {

            Toast.makeText(this@MainActivity,"Welcome $name $sirname",Toast.LENGTH_SHORT).show()

        }
    }
}