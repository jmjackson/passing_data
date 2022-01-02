package com.servicioshm.change

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class PostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        var shortTitle=findViewById<TextView>(R.id.textView)
        var desc=findViewById<TextView>(R.id.textView2)
        var btnB=findViewById<Button>(R.id.btnBack)

        var title=intent.getStringExtra("title")
        var description=intent.getStringExtra("description")

        shortTitle.text=title
        desc.text=description


        btnB.setOnClickListener {
          startActivity(Intent(this,MainActivity::class.java))
        }
    }
}