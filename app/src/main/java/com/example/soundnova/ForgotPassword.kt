package com.example.soundnova

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import android.util.Log

class ForgotPassword : ComponentActivity() {
    private lateinit var editSignUpEmail: EditText
    private lateinit var buttonSendBTN: Button
    private lateinit var buttonBack : Button
    private lateinit var note : TextView

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.forget_password_activity)

        editSignUpEmail = findViewById(R.id.editTextSignUpEmail)
        buttonSendBTN = findViewById(R.id.buttonSendBTN)
        buttonBack = findViewById(R.id.buttonBack)
        note = findViewById(R.id.note)


        buttonBack.setOnClickListener {
            val intent = Intent(applicationContext, Login::class.java)
            startActivity(intent)

        }


        buttonSendBTN.setOnClickListener {
            val email = editSignUpEmail.text.toString()
            if (email.isEmpty()) {
                note.setText("Email is empty")
            } else {
                // gui thong bao ve email
                    val intent = Intent(applicationContext, ChangePassword::class.java)
                    startActivity(intent)

            }
        }

    }

}