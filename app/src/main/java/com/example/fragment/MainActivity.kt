package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            showfragment(analogclock())
        }
        binding.btn2.setOnClickListener {
            showfragment(kakashiimage())
        }


    }

    private fun showfragment(frag:Fragment) {
     var fragg = supportFragmentManager
        var tranction = fragg.beginTransaction()
        tranction.replace(R.id.frameLayout,frag)
        tranction.commit()
    }
}