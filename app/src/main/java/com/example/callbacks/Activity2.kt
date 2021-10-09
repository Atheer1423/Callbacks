package com.example.callbacks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        Toast.makeText(this, "onCreate2", Toast.LENGTH_SHORT).show()
        Log.d("create","onCreate2")
       var b2=findViewById<Button>(R.id.b2)
        var classB=Click()

            classB.Click(object: OnClick {
                override fun onclick(){
                    b2.setOnClickListener{
                    var int= Intent(baseContext,Activity3::class.java)
                    startActivity(int)
                }

            }})
    }
    override fun onStart() {
        super.onStart()
        Log.d("start","onStart2")
        Toast.makeText(this, "onStart2", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("resume","onResume2")
        Toast.makeText(this, "onResume2", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("pause","onPause2")
        Toast.makeText(this, "onPause2", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("stop","onStop2")
        Toast.makeText(this, "onStop2", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("destroy","onDestroy2")
        Toast.makeText(this, "onDestory2", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("restart","onRestart2")
        Toast.makeText(this, "onRestart2", Toast.LENGTH_SHORT).show()
    }

}