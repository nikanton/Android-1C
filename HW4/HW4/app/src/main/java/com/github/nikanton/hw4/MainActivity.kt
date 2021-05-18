package com.github.nikanton.hw4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt = findViewById<TextView>(R.id.textView2)
        txt.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, FullNoteActivity::class.java)
            startActivity(intent)
        })
    }
}