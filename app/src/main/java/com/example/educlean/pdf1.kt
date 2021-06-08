package com.example.educlean

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.educlean.pdf1
import kotlinx.android.synthetic.main.activity_pdf1.*

class pdf1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf1)

        pdf1.fromAsset("pdf1.pdf").load()

    }
}