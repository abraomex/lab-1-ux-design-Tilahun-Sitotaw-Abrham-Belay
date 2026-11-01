package com.example.mpesaui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SendMoneyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_money)

        findViewById<View>(R.id.btnBack)?.setOnClickListener {
            finish()
        }

        findViewById<View>(R.id.btnContinue)?.setOnClickListener {
            Toast.makeText(this, "Money sent successfully!", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
