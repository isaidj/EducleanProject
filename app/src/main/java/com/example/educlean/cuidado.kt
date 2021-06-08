package com.example.educlean

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import kotlinx.android.synthetic.main.activity_agua.*
import kotlinx.android.synthetic.main.activity_cuidado.*

class cuidado : AppCompatActivity() {
    var video1: VideoView?=null
    var mediaController: MediaController?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuidado)
        back4.setOnClickListener(){
            finish()
        }

        video1 = findViewById<View>(R.id.video1) as VideoView?

        if(mediaController==null){
            mediaController = MediaController(this)
            mediaController!!.setAnchorView(this.video1)
        }

        video1!!.setMediaController(mediaController)

        video1!!.setVideoURI(Uri.parse("android.resource://"+ (packageName +"/"+R.raw.cuidado )))

        video1!!.requestFocus()

        video1!!.start()

        video1!!.setOnCompletionListener(){
            Toast.makeText(applicationContext,"video End", Toast.LENGTH_LONG).show()

        }

        video1!!.setOnErrorListener{ mediaPlayer,i,i2->

            Toast.makeText(applicationContext,"Error", Toast.LENGTH_LONG).show()
            false
        }
    }
}