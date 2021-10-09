package com.example.callbacks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class Activity3 : AppCompatActivity() {
    var i=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        Toast.makeText(this, "onCreate3", Toast.LENGTH_SHORT).show()
        Log.d("create","onCreate3")
        var b3=findViewById<Button>(R.id.b3)



            b3.setOnClickListener{
                    var int= Intent(baseContext,MainActivity::class.java)
                Toast.makeText(this, "toHome", Toast.LENGTH_SHORT).show()
                    startActivity(int)
                }


    }
    override fun onStart() {
        super.onStart()
        Log.d("start","onStart3")
        Toast.makeText(this, "onStart3", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("resume","onResume3")
        Toast.makeText(this, "onResume3", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("pause","onPause3")
        Toast.makeText(this, "onPause3", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("stop","onStop3")
        Toast.makeText(this, "onStop3", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("destroy","onDestroy3")
        Toast.makeText(this, "onDestory3", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("restart","onRestart3")
        Toast.makeText(this, "onRestart3", Toast.LENGTH_SHORT).show()
    }
}