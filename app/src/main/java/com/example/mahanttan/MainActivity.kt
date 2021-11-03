package com.example.mahanttan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var nombre: EditText
    private lateinit var apellido: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mostrarMensaje("Estado: Creando....")
        setContentView(R.layout.activity_main)
        val btnSaludar = findViewById<Button>(R.id.registrar)
        nombre=findViewById(R.id.nombre)
        apellido=findViewById(R.id.apellido)
    }

    override fun onResume() {
        mostrarMensaje("Estado: Resumen, esperando continuar.....")
        super.onResume()
    }

    override fun onPause() {
        mostrarMensaje("Estado: Pausado...")
        super.onPause()
    }

    fun mostrarMensaje(mensaje: String){
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show()
    }


    fun saludar(view: View) {
        val btn: Button = view as Button
        btn.text="Se hizo click"
        val saludar= findViewById<TextView>(R.id.Saludo)
        saludar.text="Saludando a: "+nombre.text+" "+apellido.text
    }

    fun siguiente(view: View) {
        val pantalla= Intent(this,Activity2::class.java)
        val dato=Bundle()
        dato.putString("dato", "Bienvenido: "+nombre.text+" "+apellido.text)
        pantalla.putExtras(dato)
        startActivity(pantalla)
    }
}