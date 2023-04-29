package com.example.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.fragment.databinding.ActivityMainBinding


class kakashiimage:Fragment(R.layout.image){



}
class Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.image)
        val button1 = findViewById<Button>(R.id.btn4)
        button1.setOnClickListener {
          val intent = Intent()
          //  val openURL = Intent(android.content.Intent.ACTION_VIEW)
            //openURL.data = Uri.parse("https://www.tutorialkart.com/")
            //startActivity(openURL)
        }
    }
}