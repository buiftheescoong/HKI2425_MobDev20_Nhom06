package com.example.soundnova

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.google.firebase.auth.FirebaseAuth

class Login : ComponentActivity() {
    private lateinit var firebaseAuth: FirebaseAuth

    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonConfirmLogin: Button
    private lateinit var textViewForgotPassword: TextView
    private lateinit var textViewSignUp: TextView
    private lateinit var note: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in)
        firebaseAuth = FirebaseAuth.getInstance()

        editTextEmail = findViewById(R.id.editTextSignInUsername)
        editTextPassword = findViewById(R.id.editTextSignInPassword)
        buttonConfirmLogin = findViewById(R.id.buttonConfirmLogin)
        textViewForgotPassword = findViewById(R.id.textViewForgetPassword)
        textViewSignUp = findViewById(R.id.textViewSignUp)
        note = findViewById(R.id.note)

        buttonConfirmLogin.setOnClickListener {
            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()
            if (email.isNotEmpty() && password.isNotEmpty()) {
                firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
                    if (it.isSuccessful) {
                        val intent = Intent(applicationContext, HomeActivity::class.java)
                        startActivity(intent)
                    } else {
                        note.setText("Email or Password is not correct")
                        Toast.makeText(this,  "Email or Password is not correct", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            else if (email.isEmpty()) {
                note.setText("Email is empty")

            }
            else note.setText("Password is empty")
        }

        textViewSignUp.setOnClickListener {
            val intent = Intent(applicationContext, Register::class.java)
            startActivity(intent)
        }

        textViewForgotPassword.setOnClickListener {
            val intent = Intent(applicationContext, ForgotPassword::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        if (firebaseAuth.currentUser != null) {
            val intent = Intent(applicationContext, HomeActivity::class.java)
            startActivity(intent)
        }
    }

}