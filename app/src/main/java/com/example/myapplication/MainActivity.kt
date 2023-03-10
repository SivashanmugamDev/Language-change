package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.util.*
import kotlin.collections.ArrayList
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    private lateinit var context:  Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var messageView: TextView = findViewById(R.id.text)
        var btn_English: Button = findViewById(R.id.eng_btn)
        var btn_French: Button = findViewById(R.id.french_btn)

        btn_English.setOnClickListener {
            context = Localehelper.setLocale(this, "en")
            messageView.setText(resources.getString(R.string.Deployed_vehicles))
        }

        btn_French.setOnClickListener {
            context = Localehelper.setLocale(this, "fr")
            messageView.setText(resources.getString(R.string.Deployed_vehicles))
        }

        }


    }