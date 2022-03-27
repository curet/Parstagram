package com.jose.parstagram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.parse.ParseUser

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // [1]. if user is logged in > goto the MainActivity
        if (ParseUser.getCurrentUser() != null){
            goToMainActivity()
        }

        findViewById<Button>(R.id.login_button).setOnClickListener{
            val username = findViewById<EditText>(R.id.et_username).text.toString()
            val password = findViewById<EditText>(R.id.et_password).text.toString()
            loginUser(username, password)
        }

        findViewById<Button>(R.id.signup_button).setOnClickListener{
            val username = findViewById<EditText>(R.id.et_username).text.toString()
            val password = findViewById<EditText>(R.id.et_password).text.toString()
            signUpUser(username, password)
        }
    }

    private fun signUpUser(username: String, password: String) {
        val user = ParseUser()
        user.setUsername(username)
        user.setPassword(password)

        user.signUpInBackground{ e ->
            if(e == null){
                // User has successfully created a new account
                goToMainActivity()
                Toast.makeText(this, "Successfully signed in user", Toast.LENGTH_SHORT).show()
            }else{
                e.printStackTrace()
                Toast.makeText(this, "Error signing in", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun loginUser(username: String, password: String) {
        ParseUser.logInInBackground(username, password,({ user, e ->
            if (user != null){
                Log.i(TAG, "Successfully logged in user")
                Toast.makeText(this, "Successfully logged in user", Toast.LENGTH_SHORT).show()
                goToMainActivity()
            }else{
                e.printStackTrace() // if login fails
                Toast.makeText(this, "Error logging in $username  $password", Toast.LENGTH_SHORT).show()
            }
        }))
    }

    private fun goToMainActivity(){
        val intent = Intent(this@LoginActivity, MainActivity::class.java)
        startActivity(intent)
        finish() // close the login activity like for example when clicking going to the back
    }

    companion object {
        const val TAG = "LoginActivity"
    }
}