package com.example.educlean

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.educlean.pdf1
import com.example.educlean.pdf2
import kotlinx.android.synthetic.main.activity_pdf1.*
import kotlinx.android.synthetic.main.activity_pdf2.*

class pdf2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf2)
        pdf2.fromAsset("agua_salud_vida.pdf").load()
    }
}