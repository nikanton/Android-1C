package com.github.nikanton.Android

import android.app.Activity
import android.app.Application
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

//val sendEmail =



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailBtn = findViewById<Button>(R.id.email_btn)
        emailBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:") // only email apps should handle this
                putExtra(Intent.EXTRA_EMAIL, Array<String>(1){"nikishin.ar@phystech.edu"})
                putExtra(Intent.EXTRA_SUBJECT, "HW3 Android")
                putExtra(Intent.EXTRA_TEXT, "Отправлено из моего первого приложения")
            }
            startActivity(intent)
        })

        val profileBtn = findViewById<Button>(R.id.profile_btn)
        profileBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        })
    }
}