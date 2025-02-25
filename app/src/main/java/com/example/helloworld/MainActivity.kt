package com.example.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.net.Uri
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val follow = findViewById<Button>(R.id.Button1)
        val connect = findViewById<Button>(R.id.Button2)
        val skills = findViewById<Button>(R.id.BtnSkills)
        val education = findViewById<Button>(R.id.BtnEducation)

        follow.setOnClickListener {
            val url = "https://www.instagram.com/by_sonu_kr/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        connect.setOnClickListener {
            val url = "https://www.linkedin.com/in/dev-sonukr/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        skills.setOnClickListener{
            intent = Intent(this, SkillActivity::class.java)
            startActivity(intent)
        }

        education.setOnClickListener {
            intent = Intent(this,EducationActivity::class.java)
            startActivity(intent)
        }
    }

    // another button listener
    /*fun openLink(view: View) {
        val url = "https://www.instagram.com/by_sonu_kr/"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }*/
}