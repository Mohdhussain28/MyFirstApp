package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val onBttn =findViewById<Button>(R.id.mybutton)
        val onTextView =findViewById<TextView>(R.id.textView)
        var timesClicked=0
        onBttn.setOnClickListener {
            timesClicked+=1
            onTextView.text=timesClicked.toString()
            Toast.makeText(this, "hey! hussain", Toast.LENGTH_SHORT).show()
        }
    }
}