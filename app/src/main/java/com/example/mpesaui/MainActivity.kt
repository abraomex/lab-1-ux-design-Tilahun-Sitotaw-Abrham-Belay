package com.example.mpesaui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Profile Avatar -> ProfileActivity
        findViewById<View>(R.id.tvAvatar)?.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        // Quick action: Send Money -> SendMoneyActivity
        findViewById<View>(R.id.btnSendMoney)?.setOnClickListener {
            startActivity(Intent(this, SendMoneyActivity::class.java))
        }

        // Recent activity: View all -> TransactionHistoryActivity
        findViewById<View>(R.id.btnViewAll)?.setOnClickListener {
            startActivity(Intent(this, TransactionHistoryActivity::class.java))
        }

        // Bottom Nav: History -> TransactionHistoryActivity
        findViewById<View>(R.id.navHistory)?.setOnClickListener {
            startActivity(Intent(this, TransactionHistoryActivity::class.java))
        }

        // Bottom Nav: Profile -> ProfileActivity
        findViewById<View>(R.id.navProfile)?.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}
