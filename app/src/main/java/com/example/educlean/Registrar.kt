package com.example.educlean

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_registrar.*

class Registrar : AppCompatActivity() {

    private lateinit var fieldEmail : EditText
//    private lateinit var fieldUsername : EditText
    private lateinit var fieldcontraseña : EditText
    private lateinit var fieldVcontraseña : EditText
    private lateinit var btnRegistrar:TextView


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)

        btnRegistrar= findViewById(R.id.btnRegistrar)
        fieldEmail=findViewById(R.id.fieldUsername3)
//        fieldUsername=findViewById(R.id.fieldUsername)
        fieldcontraseña=findViewById(R.id.fieldContraseña2)
        fieldVcontraseña=findViewById(R.id.fieldcontraseña3)


                backRegistro.setOnClickListener(){
                    finish()
                }

        setup()
    }

    private fun setup (){


        btnRegistrar.setOnClickListener(){

            if(
                fieldEmail.text.isNotEmpty() &&
//                fieldUsername.text.isNotEmpty() &&
                fieldcontraseña.text.isNotEmpty()&&
                fieldVcontraseña.text.isNotEmpty()){

                    if( fieldVcontraseña.text.toString() == fieldcontraseña.text.toString() ){
                        FirebaseAuth.getInstance()
                            .createUserWithEmailAndPassword(fieldEmail.text.toString(), fieldcontraseña.text.toString())
                            .addOnCompleteListener {
                                if (it.isSuccessful){
//

                                         Toast.makeText(applicationContext,"Usuario registrado",Toast.LENGTH_SHORT).show()
//
                                    intent = Intent(this,Login::class.java).apply {



                                    }

                                    startActivity(intent)

                                    finish()

                                }else{
                                    alert("error","Usuario registrado")

                                }

                            }
                    }else{
                        alert("Contraseñas diferentes" ,"Las contraseña ingresadas no concuerdan")
                    }






            }else{

                alert("Campo vacio" ,"Algun campo se encuentra vacio")

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
