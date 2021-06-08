package com.example.educlean

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.educlean.R
import com.example.educlean.activities_individual.activity_tom
import kotlinx.android.synthetic.main.fragment_activities.*


class Activities : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_activities, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        LinearTom.setOnClickListener() {
           val intent = Intent(context, activity_tom::class.java).apply {

            }

            startActivity(intent)
        }
    }
}