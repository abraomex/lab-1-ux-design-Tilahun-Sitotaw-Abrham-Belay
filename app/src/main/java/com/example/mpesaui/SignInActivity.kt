package com.example.mpesaui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val btnSignIn = findViewById<View>(R.id.btnSignIn)
        val btnFaceId = findViewById<View>(R.id.btnFaceId)

        val navigateToMain = {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        btnSignIn?.setOnClickListener { navigateToMain() }
        btnFaceId?.setOnClickListener { navigateToMain() }
    }
}
