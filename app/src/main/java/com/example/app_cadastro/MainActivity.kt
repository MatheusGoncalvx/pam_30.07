package com.example.app_cadastro

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate (SavedInstanceState: Bundle?) {
        super.onCreate(SavedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Bem-Vindo na aula de PAM 2", Toast.LENGTH_SHORT).show()
        val view = TextView(this)
        view.setText("Frutas")
        setContentView(view)
    }

}