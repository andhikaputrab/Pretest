package com.example.pretest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
/*
    10117167 - Andhika Putra Bagaskara - IF5
    1 April 2020 mengerjakan halaman welcome

    10117167 - Andhika Putra Bagaskara - IF5
    2 April 2020 mengerjakan halaman login

    10117167 - Andhika Putra Bagaskara - IF5
    3 April 2020 mengerjakan halaman Biodata

    10117167 - Andhika Putra Bagaskara - IF5
    3 April 2020 mengerjakan halaman Say hai
*/

    private lateinit var btnNext : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNext = findViewById(R.id.btnNext)
        btnNext.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

    }
}
