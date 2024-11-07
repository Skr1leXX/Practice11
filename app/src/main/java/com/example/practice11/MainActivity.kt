package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import com.example.practice11.R

class MainActivity : AppCompatActivity() {

    private lateinit var imageView1: ImageView
    private lateinit var imageView2: ImageView
    private lateinit var buttonLoadImage: Button
    private lateinit var buttonImage: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        imageView1 = findViewById(R.id.imageView1)
        imageView2 = findViewById(R.id.imageView2)
        buttonLoadImage = findViewById(R.id.buttonLoadImage)
        buttonImage = findViewById(R.id.button_image)


        buttonLoadImage.setOnClickListener {
            imageView1.visibility = View.INVISIBLE
            imageView2.setImageResource(R.drawable.image2)
            imageView2.visibility = View.VISIBLE
        }


        buttonImage.setOnClickListener {
            if (buttonImage.drawable.constantState == resources.getDrawable(R.drawable.btn_check_buttonless_off).constantState) {
                buttonImage.setImageResource(R.drawable.btn_check_buttonless_on)
            } else {
                buttonImage.setImageResource(R.drawable.btn_check_buttonless_off)
            }
        }
    }
}