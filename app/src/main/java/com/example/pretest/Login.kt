package com.example.pretest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {

    private lateinit var btnNext : Button
    private lateinit var txtView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        txtView = findViewById(R.id.txtView)
        btnNext = findViewById(R.id.btnNext)

        val formatText = "Dengan Menekan Tombol masuk berarti Anda menyetujui <b>Ketentuan Pengguna</b> dan <b>Kebijakan Data</b> kami"
        txtView.text = Html.fromHtml(formatText)

        btnNext.setOnClickListener {
            val intent = Intent(this, Biodata::class.java)
            startActivity(intent)
        }
    }
}
