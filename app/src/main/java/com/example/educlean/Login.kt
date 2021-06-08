package com.example.educlean

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog


import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthCredential


class Login : AppCompatActivity() {

    private lateinit var btnLogin : Button

    private lateinit var btnCrearCuenta : TextView
    private lateinit var fieldUsername : EditText
    private lateinit var fieldcontraseña : EditText

    override fun onCreate(savedInstanceState: Bundle?) {


        Thread.sleep(2000)
        setTheme(R.style.Theme_Educlean)

        setTheme(R.style.Theme_Educlean_NoActionBar)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin= findViewById(R.id.btnLogin)

        btnCrearCuenta= findViewById(R.id.btnCrearCuenta)
    
        fieldUsername=findViewById(R.id.fieldUsername)
        fieldcontraseña=findViewById(R.id.fieldcontraseña)


        btnCrearCuenta.setOnClickListener(){
            intent = Intent(this,Registrar::class.java).apply {

            }

            startActivity(intent)
        }
        setup()

    }

    private fun setup (){
        title ="Autenticacion"

        btnLogin.setOnClickListener(){


            if(fieldUsername.text.isNotEmpty() && fieldcontraseña.text.isNotEmpty()){

                FirebaseAuth.getInstance()
                    .signInWithEmailAndPassword(fieldUsername.text.toString(), fieldcontraseña.text.toString())
                    .addOnCompleteListener {
                        if (it.isSuccessful){


                                intent = Intent(this,MainActivity::class.java).apply {

                                }

                                startActivity(intent)
                                finish()

                        }else{
                            alert("error","Contraseña o usuario incorrectos")

                        }

                    }
            }else{
                alert("Error","Usuario o contraseña incorrecto")
            }

        }
    }

    fun alert(titulo:String,mensaje: String){

        val builder= AlertDialog.Builder(this)
        builder.setTitle(titulo)
        builder.setMessage(mensaje)
        builder.setPositiveButton("ok",null)
        val dialog: AlertDialog =builder.create()
        dialog.show()
    }



}