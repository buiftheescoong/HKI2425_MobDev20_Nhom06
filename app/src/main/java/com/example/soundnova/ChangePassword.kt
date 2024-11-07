package com.example.soundnova

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class ChangePassword : ComponentActivity() {
    private lateinit var editTextCurrentPass : EditText
    private lateinit var editTextNewPass : EditText
    private lateinit var editTextConfirmNewPass : EditText
    private lateinit var note : TextView
    private lateinit var buttonSendChange : Button
    private lateinit var buttonCancel : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.change_password)
        editTextCurrentPass = findViewById(R.id.editTextCurrentPass)
        editTextNewPass = findViewById(R.id.editTextNewPass)
        editTextConfirmNewPass = findViewById(R.id.editTextConfirmNewPass)
        note = findViewById(R.id.note)
        buttonSendChange = findViewById(R.id.buttonSendChange)
        buttonCancel = findViewById(R.id.buttonCancel)

        buttonCancel.setOnClickListener {
            val intent = Intent(applicationContext, Login::class.java)
            startActivity(intent)
        }

        buttonSendChange.setOnClickListener {
            val intent = Intent(applicationContext, Login::class.java)
            startActivity(intent)
        }
    }
}