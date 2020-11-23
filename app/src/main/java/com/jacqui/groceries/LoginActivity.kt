package com.jacqui.groceries

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener{

//            if(edUsername.text.trim().isNotEmpty() || edPassword.text.trim().isNotEmpty()){
//                //
//                Toast.makeText(this, "Input provided", Toast.LENGTH_LONG).show()
//            }else{
//                Toast.makeText(this, "Input required", Toast.LENGTH_LONG).show()
//            }
            val intent = Intent(this, MainActivity:: class.java);
            startActivity(intent)
        }

        tvRegister.setOnClickListener {
            val intent = Intent(this, SignUpActivity:: class.java);
            startActivity(intent)
        }
    }
}