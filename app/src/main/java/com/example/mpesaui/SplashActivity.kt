package com.example.mpesaui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    private val handler = Handler(Looper.getMainLooper())
    private val navigateRunnable = Runnable {
        navigateToSignIn()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        findViewById<View>(R.id.splashRoot)?.setOnClickListener {
            handler.removeCallbacks(navigateRunnable)
            navigateToSignIn()
        }

        handler.postDelayed(navigateRunnable, 2000)
    }

    private fun navigateToSignIn() {
        startActivity(Intent(this, SignInActivity::class.java))
        finish()
    }
}
