package com.testmypsy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val aggressionButton = findViewById<Button>(R.id.aggressionTestButton)
        aggressionButton.setOnClickListener {
            val intent = Intent(this,AggressionTest::class.java)
            startActivity(intent)
        }
        val EIButton = findViewById<Button>(R.id.EITestButton)
        EIButton.setOnClickListener {
            val intent = Intent(this,EITest::class.java)
            startActivity(intent)
        }
        val QOLButton = findViewById<Button>(R.id.QOLTestButton)
        QOLButton.setOnClickListener {
            val intent = Intent(this,QOLTest::class.java)
            startActivity(intent)
        }
        val PTButton = findViewById<Button>(R.id.PTButton)
        PTButton.setOnClickListener {
            val intent = Intent(this,PTest::class.java)
            startActivity(intent)
        }
        val SaButton = findViewById<Button>(R.id.SAButton)
        SaButton.setOnClickListener {
            val intent = Intent(this,SaTest::class.java)
            startActivity(intent)
        }
        val SpButton = findViewById<Button>(R.id.SPIButton)
        SpButton.setOnClickListener {
            val intent = Intent(this,sptest::class.java)
            startActivity(intent)
        }
    }
}