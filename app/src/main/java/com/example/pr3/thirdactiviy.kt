package com.example.pr3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
class thirdactivity : AppCompatActivity() {
    lateinit var textView3: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thirdactiviy)
        textView3=findViewById(R.id.textView3)
        val intent2=intent
        val message=intent2.getStringExtra("secondactivity").toString()
        textView3.text=message
    }
}
