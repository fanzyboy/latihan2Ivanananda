package com.ivan.latihan2kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    lateinit var usernameInput: EditText
    lateinit var passwordInput: EditText
    lateinit var loginBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        loginBtn = findViewById(R.id.login_btn)



        loginBtn.setOnClickListener {
            val username = usernameInput.text.toString()
            val pw = passwordInput.text.toString()

            if (username == "admin" && pw == "12345") {
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("EXTRA_MESSAGE", "Hello from MainActivity")
                startActivity(intent)

            } else {
                Toast.makeText(
                    this,
                    "username dan passsword yang di inputkan salah",
                    Toast.LENGTH_SHORT
                ).show()

            }
        }
    }

}

