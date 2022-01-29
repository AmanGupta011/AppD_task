package com.example.amangupta_appd

import android.graphics.PointF.length
import android.opengl.Matrix.length
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button =findViewById(R.id.btn_submit)
        val txt: EditText=findViewById(R.id.name)
        val ag: EditText=findViewById(R.id.num)
//        val len=string.length
        btn.setOnClickListener {
            val string = txt.text.toString()
            val age = ag.text.toString()
            if(string=="" && age==""){
                Toast.makeText(this, "Enter Name and Age", Toast.LENGTH_SHORT).show()
            }

            else if (string==""){

                Toast.makeText(this, "Enter Name", Toast.LENGTH_SHORT).show()
            }
            else if (age==""){
                Toast.makeText(this, "Enter Age", Toast.LENGTH_SHORT).show()
            }
            else{

                Toast.makeText(this, "Hi!! I am ${string}. Age-${age} ,Go! corona Go!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
