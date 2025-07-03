package com.example.petcareregistro

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class FormularioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etEdad = findViewById<EditText>(R.id.etEdad)
        val etRaza = findViewById<EditText>(R.id.etRaza)
        val rgTipo = findViewById<RadioGroup>(R.id.rgTipo)
        val cbVacunas = findViewById<CheckBox>(R.id.cbVacunas)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)
        val btnVolverInicio = findViewById<Button>(R.id.btnVolverInicio)

        btnEnviar.setOnClickListener {
            val nombre = etNombre.text.toString()
            val edad = etEdad.text.toString()
            val raza = etRaza.text.toString()
            val tipo = findViewById<RadioButton>(rgTipo.checkedRadioButtonId)?.text.toString()
            val vacunas = if (cbVacunas.isChecked) "Sí" else "No"

            val intent = Intent(this, ConfirmacionActivity::class.java)
            intent.putExtra("nombre", nombre)
            intent.putExtra("edad", edad)
            intent.putExtra("raza", raza)
            intent.putExtra("tipo", tipo)
            intent.putExtra("vacunas", vacunas)
            startActivity(intent)
        }

        btnVolverInicio.setOnClickListener {
            finish()
        }
    }
}


