package com.servicioshm.change

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var user=findViewById<EditText>(R.id.editText2)
        var desc=findViewById<EditText>(R.id.editText3)
        var btn=findViewById<Button>(R.id.button)

        btn.setOnClickListener{
            var intent=Intent(this,PostActivity::class.java)

            var title=user.text.toString()
            var description=desc.text.toString()

            intent.putExtra("title",title)
            intent.putExtra("description",description)
            startActivity(intent)
        }
    }
}