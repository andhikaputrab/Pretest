package com.example.pretest

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ShowText : AppCompatActivity() {

    private var KEY1 = "NAMA"
    private var KEY2 = "UMUR"
    //private lateinit var txtShow : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_text)

        val txtShow :TextView = findViewById(R.id.txtShow)

        val bundle = intent.extras
        val nama = bundle?.getString(KEY1)
        val umur = bundle?.getString(KEY2)
        txtShow.setText("Beres! Sekarang $nama udah bisa ngecek penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)")
    }
}
