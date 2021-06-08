package com.example.educlean

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_readings.*
import kotlinx.android.synthetic.main.fragment_videos.*

class Readings : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_readings, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        pdf1click.setOnClickListener(){
            val intent = Intent(context,pdf1::class.java).apply {

            }

            startActivity(intent)
        }
        pdf2click.setOnClickListener(){
            val intent = Intent(context,pdf2::class.java).apply {

            }

            startActivity(intent)
        }
    }
}