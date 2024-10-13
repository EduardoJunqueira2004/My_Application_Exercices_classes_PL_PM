package com.example.myapplicationexercicesclassespl

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log

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
        Log.d("****TAG ", "OnCreate")
        Toast.makeText(this, "oncreate", Toast.LENGTH_LONG).show()//show the toast  message on the screen On create method
        //Toast.makeText(this, R.string.app_name, Toast.LENGTH_LONG).show()//show the toast  message on the screen the string with key app_name method
        //Toast.makeText(this, R.string.textoinicial, Toast.LENGTH_LONG).show()//show the toast  message on the screen the string with key textoinicial method
        Toast.makeText(this, R.string.textopergunta, Toast.LENGTH_LONG).show()//show the toast  message on the screen the string with key textopergunta method
    }
        //Atencion this words are case sensitive
        override fun onPause() {
            super.onPause()
            Log.d("****TAG ","onPause")
        }

    override fun onStop() {
        super.onStop()
        Log.d("****TAG ","onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d("****TAG ","onStart")
    }
}
