package com.example.petcareregistro

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ConfirmacionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmacion)

        val tvDatos = findViewById<TextView>(R.id.tvDatos)
        val btnSalir = findViewById<Button>(R.id.btnSalir)
        val btnVolverFormulario = findViewById<Button>(R.id.btnVolverFormulario)

        val nombre = intent.getStringExtra("nombre")
        val edad = intent.getStringExtra("edad")
        val raza = intent.getStringExtra("raza")
        val tipo = intent.getStringExtra("tipo")
        val vacunas = intent.getStringExtra("vacunas")

        val resumen = """
            🐾 Registro Exitoso 🐾

            Nombre: $nombre
            Edad: $edad años
            Tipo: $tipo
            Raza: $raza
            Vacunas al día: $vacunas
        """.trimIndent()

        tvDatos.text = resumen

        btnSalir.setOnClickListener {
            finishAffinity()
        }

        btnVolverFormulario.setOnClickListener {
            finish()
        }
    }
}


