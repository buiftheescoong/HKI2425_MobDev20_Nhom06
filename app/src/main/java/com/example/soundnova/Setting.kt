package com.example.soundnova

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class Setting: ComponentActivity() {
    private lateinit var profileImg: Image
    private lateinit var userName: TextView
    private lateinit var userStatus: TextView
    private lateinit var changePass: Button
    private lateinit var logOut: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.setting)

        userName = findViewById(R.id.username)
        userStatus = findViewById(R.id.user_status)
        changePass = findViewById(R.id.btn_change_password)
        logOut = findViewById(R.id.btn_logout)

        logOut.setOnClickListener{
            val intent = Intent(applicationContext, Login::class.java)
            startActivity(intent)
            finish()
        }

    }
}