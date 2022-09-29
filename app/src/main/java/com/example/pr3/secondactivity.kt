package com.example.pr3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.view.View
class secondactivity : AppCompatActivity() {
    //lateinit var button3: Button
    lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)
        editText = findViewById(R.id.editTextTextPersonName)
    }
    fun GoToNext(view: View) {
        Log.d("secondactivity", "Clicked.")
        val message = editText.text.toString()
        intent = Intent(this, thirdactivity::class.java)
        intent.putExtra("secondactivity", message)
        startActivity(intent)
    }
}

