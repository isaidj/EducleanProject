package com.example.educlean

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import androidx.browser.customtabs.CustomTabsClient.getPackageName
import kotlinx.android.synthetic.main.fragment_videos.*


class Videos : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_videos, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        aguaPorDerecho.setOnClickListener(){
           val intent = Intent(context,Agua::class.java).apply {

            }

            startActivity(intent)
        }


        cuidadoDelAgua.setOnClickListener(){
            val intent = Intent(context,cuidado::class.java).apply {

            }

            startActivity(intent)
        }

//

//        val mediaController=MediaController(context)
//        mediaController.setAnchorView(video1)
//
//        val offlineUri =Uri.parse("android.resource://com.android.AndroidVideoPlayer"+R.raw.agua_derecho)
//        video1.setMediaController(mediaController)
//        video1.setVideoURI(offlineUri)
//        video1.requestFocus()
//        video1.start()
    }


}