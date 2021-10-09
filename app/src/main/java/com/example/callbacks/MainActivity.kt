package com.example.callbacks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var b1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("create","onCreate1")
        Toast.makeText(this, "onCreate1", Toast.LENGTH_SHORT).show()


        var classB = Click()
        b1 = findViewById(R.id.b1)

            classB.Click(object : OnClick {
                override fun onclick() {
                    b1.setOnClickListener {
                    var int = Intent(baseContext, Activity2::class.java)
                    startActivity(int)
                }

            }})

    }
    override fun onStart() {
        super.onStart()
        Log.d("start","onStart1")
        Toast.makeText(this, "onStart1", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("resume","onResume1")
        Toast.makeText(this, "onResume1", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("pause","onPause1")
        Toast.makeText(this, "onPause1", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("stop","onStop1")
        Toast.makeText(this, "onStop1", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("destroy","onDestroy1")
        Toast.makeText(this, "onDestory1", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("restart","onRestart1")
        Toast.makeText(this, "onRestart1", Toast.LENGTH_SHORT).show()
    }
}




