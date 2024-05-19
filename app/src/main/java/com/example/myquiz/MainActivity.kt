package com.example.myquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart: Button=findViewById(R.id.btn_start)
        val etName: EditText=findViewById(R.id.et_name)

        btnStart.setOnClickListener{
            if(etName.text.isEmpty()){
                Toast.makeText(this, "Please Enter your name", Toast.LENGTH_SHORT).show()
            }
            else{
                val intent= Intent(this, QuizQuestionsAct::class.java) //One page to another
                intent.putExtra(Constants.USER_NAME, etName.text.toString()) //Intent ke saath kuch data bhi saath mai lete jao
                startActivity(intent) //Start the activity, move to another screen
                finish()  //If after going to next screen you don't want to go back after pressing back button
            }
        }

    }
}