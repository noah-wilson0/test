package com.noah.diet_memo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {



    ///나는 main 액티비이의 코드이다.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //mergetest의 test프로젝트가 작업중이다.
        val name="mergetest"


        Toast.makeText(this,"환영합니다~~",Toast.LENGTH_SHORT).show()

        val writeButton=findViewById<ImageView>(R.id.writeBtn)
        writeButton.setOnClickListener {
            val mDialogView=LayoutInflater.from(this).inflate(R.layout.custom_dialog,null)
            val mBuilder=AlertDialog.Builder(this)
                .setView(mDialogView)
                .setTitle("운동 메모 다이얼 로그")
            mBuilder.show()
        }
        //mergetest2의 test프로젝트가 작업중이다.
        Log.d("MAIN","메인 액티비티")
        Log.d("MAIN","메인 액티비티")
        Log.d("MAIN","메인 액티비티")
        Log.d("MAIN","메인 액티비티")



    }
}