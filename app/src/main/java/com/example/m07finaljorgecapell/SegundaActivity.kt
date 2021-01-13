package com.example.m07finaljorgecapell

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)
        setSupportActionBar(toolbar)
/*
        findViewById<Button>(R.id.backToMenu2).setOnClickListener(){
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
    }*/}

        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.menu, menu)
            return true
        }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            var itemView = item.itemId
            when (itemView) {
                R.id.About -> Toast.makeText(applicationContext,"Felicidades Capell aprobao", Toast.LENGTH_SHORT).show()
            }
            return false

        }

}