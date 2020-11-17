package com.jacqui.groceries

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btnSignup.setOnClickListener {
            if(edUsername.text.trim().isNotEmpty() && edEmail.text.trim().isNotEmpty()
                && edPassword.text.trim().isNotEmpty() && edCPassword.text.trim().isNotEmpty()){
                //
            } else {
                Toast.makeText(this, "Provide input", Toast.LENGTH_LONG).show()
            }
        }
        tvSLogin.setOnClickListener {
            val intent = Intent (this, LoginActivity:: class.java);
            startActivity(intent)
        }
    }
}