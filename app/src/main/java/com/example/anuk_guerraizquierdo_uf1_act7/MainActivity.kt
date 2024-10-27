package com.example.anuk_guerraizquierdo_uf1_act7


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.util.Log;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userName = findViewById<EditText>(R.id.user)
        val password = findViewById<EditText>(R.id.password)

        val submitButton = findViewById<Button>(R.id.submitButton)

        submitButton.setOnClickListener {
            Toast.makeText(this, "username: " + userName.text.toString() + "\n" + "password: " + password.text.toString(), Toast.LENGTH_SHORT).show()
            Log.d("Main activity", "username: " + userName.text.toString() + "\n" + "password: " + password.text.toString())
        }
    }
}