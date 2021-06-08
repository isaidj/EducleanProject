package com.example.educlean.activities_individual

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.educlean.Activities
import com.example.educlean.MainActivity
import com.example.educlean.R
import kotlinx.android.synthetic.main.activity_tom.*

class activity_tom : AppCompatActivity() {

    var numPregunta: Int=0

    var numero_total:Int = 0
    var numero_buenas:Int=0

    private lateinit var r1: RadioButton
    private lateinit var r2: RadioButton
    private lateinit var r3: RadioButton
    var calificacion: Int? =null

    private val ids_respuesta = intArrayOf(
        R.id.respuesta1, R.id.respuesta2, R.id.respuesta3
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tom)

        numero_total=2

        responder.setOnClickListener(){
            if(radioGroup1.getCheckedRadioButtonId()==respuesta12.id){
                numero_buenas++
            }

            if (radioGroup2.getCheckedRadioButtonId()==respuesta3.id){
                numero_buenas++
            }

            val builder = AlertDialog.Builder(this)


            builder.setTitle("Resultado")
            builder.setMessage("Tu resultado fue: "+numero_buenas+"/"+numero_total)
            builder.setPositiveButton("Terminar"){dialog, which ->
                Toast.makeText(applicationContext,"Creada", Toast.LENGTH_SHORT).show()


                finish()

            }
            builder.setNegativeButton("Volver a intentar"){dialog, which ->
                intent = Intent(this, activity_tom::class.java).apply {

                }

                startActivity(intent)
                finish()
            }
            val dialog: AlertDialog = builder.create()

            // Display the alert dialog on app interface


            dialog.show()
        }

//      var pregunta= resources.getStringArray(R.array.pregunta1)
//
//       for (i in 0 until(pregunta.size)){
//           var pregunta: String=pregunta.
//       }



    }
}