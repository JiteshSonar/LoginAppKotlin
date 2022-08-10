package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        navigations
        var login: Button = findViewById(R.id.LoginBtn)
        var username: TextView = findViewById(R.id.username_et)
        var password: TextView = findViewById(R.id.password_et)

        login.setOnClickListener{
           var status =  if (username.text.toString() == "Admin"
               && password.text.toString() == "Admin"
           ) {
               var intent = Intent(this, LoggedIn:: class.java)
               startActivity(intent)
           }
            else "Login Fail"




        }
        var signUp: TextView = findViewById(R.id.SignUp)
        signUp.setOnClickListener {
            var intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }



    }
}