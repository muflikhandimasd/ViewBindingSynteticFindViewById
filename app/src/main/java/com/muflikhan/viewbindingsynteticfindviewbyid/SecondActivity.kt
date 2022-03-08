package com.muflikhan.viewbindingsynteticfindviewbyid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnOK = findViewById<Button>(R.id.btnOK)
        btnOK.setOnClickListener{
            Toast.makeText(this, "INI BTN AKTIF", Toast.LENGTH_SHORT).show()
        }
    }
}