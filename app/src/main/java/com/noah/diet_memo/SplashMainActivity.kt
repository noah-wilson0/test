package com.noah.diet_memo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import java.lang.Exception

class SplashMainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth


    var hello="hello world!"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_main)
        auth = Firebase.auth
        try {
            Toast.makeText(this,"왠래 로그인 되어있는 사람입니다.",Toast.LENGTH_LONG).show()
            Handler().postDelayed({
                startActivity(Intent(this,MainActivity::class.java))
                finish()
            },3000)
        }catch (e:Exception) {
            Log.d("SPLASH", "로그인 시켜줘야 함")


            auth = Firebase.auth
            auth.signInAnonymously()
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        Toast.makeText(
                            this,
                            "비회원 로그인 성공",
                            Toast.LENGTH_SHORT,
                        ).show()
                        Handler().postDelayed({
                            startActivity(Intent(this, MainActivity::class.java))
                            finish()
                        }, 3000)

                    } else {
                        // If sign in fails, display a message to the user.

                        Toast.makeText(
                            this,
                            "비회원 로그인 실패.",
                            Toast.LENGTH_SHORT,
                        ).show()
                    }
                    Log.d("MAIN",hello)
                    Log.d("MAIN",hello)
                    Log.d("MAIN",hello)
                    Log.d("MAIN",hello)
                    Log.d("MAIN",hello)
                    Log.d("MAIN",hello)
                    Log.d("MAIN",hello)
                    Log.d("MAIN",hello)
                    Log.d("MAIN",hello)
                    Log.d("MAIN",hello)
                }
        }



    }
}