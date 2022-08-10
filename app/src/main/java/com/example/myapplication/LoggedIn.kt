package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoggedIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loggedin)

        var logout: Button = findViewById(R.id.LogoutBtn)
        logout.setOnClickListener{
            var intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }

    }
}