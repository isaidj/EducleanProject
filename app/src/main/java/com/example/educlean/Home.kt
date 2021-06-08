package com.example.educlean

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_home.*


class Home : Fragment()  {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment




        return inflater.inflate(R.layout.fragment_home, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        media_card_view1.setOnClickListener (){
            (activity as MainActivity).changeFragment(Activities())
        }
        media_card_view2.setOnClickListener (){
            (activity as MainActivity).changeFragment(Videos())
        }
        media_card_view3.setOnClickListener (){
            (activity as MainActivity).changeFragment(Readings())
        }




        }




    }






