package com.example.soundnova

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.ComponentActivity

class StartActivity : ComponentActivity() {
    private lateinit var buttonSignUp: Button
    private lateinit var buttonGoogle: LinearLayout
    private lateinit var buttonLogin: Button
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_activity)

        buttonSignUp = findViewById(R.id.buttonSignUp)
        buttonGoogle = findViewById(R.id.buttonGoogle)
        buttonLogin = findViewById(R.id.buttonConfirmLogin)
        imageView = findViewById(R.id.imageView)

        buttonSignUp.setOnClickListener {
            val intent = Intent(applicationContext, Register::class.java)
            startActivity(intent)
            finish()
        }

        buttonGoogle.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        buttonLogin.setOnClickListener {
            val intent = Intent(applicationContext, Login::class.java)
            startActivity(intent)
            finish()
        }
    }
}