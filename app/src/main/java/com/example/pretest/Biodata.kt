package com.example.pretest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Biodata : AppCompatActivity() {

    /*private lateinit var btnNext : Button
    private lateinit var txtNama : EditText
    private lateinit var  txtUmur : EditText*/
    private var KEY1 = "NAMA"
    private var KEY2 = "UMUR"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        val btnNext : Button = findViewById(R.id.btnNext)
        val txtNama : EditText = findViewById(R.id.txtNama)
        val txtUmur : EditText = findViewById(R.id.txtUmur)

        btnNext.setOnClickListener {
            val nama = txtNama.text.toString()
            val umur = txtUmur.text.toString()

            if ( nama != "" && umur != ""){
                val bundle = Bundle()
                bundle.putString(KEY1,nama)
                bundle.putString(KEY2,umur)

                val intent = Intent(this, ShowText::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext, "Data tidak boleh kosong", Toast.LENGTH_LONG).show()
            }

        }
    }
}
