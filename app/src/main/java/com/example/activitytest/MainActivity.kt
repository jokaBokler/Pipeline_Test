package com.example.activitytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import com.example.activitytest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Log.d("Behaviour", "*********onCreateBASED")
        Toast.makeText(this,"onCreateBASED", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        Log.d("Behaviour", "onCreate++")
        Toast.makeText(this,"onCreate++", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("Behaviour", "---------onStart")
        Toast.makeText(this,"onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("Behaviour", "onRestoreInstanceStateBased")
        Toast.makeText(this,"onRestoreInstanceStateBased", Toast.LENGTH_SHORT).show()
    }
    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        Log.d("Behaviour", "onRestoreInstanceState++")
        Toast.makeText(this,"onRestoreInstanceState++", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("Behaviour", "onResume")
        Toast.makeText(this,"onResume", Toast.LENGTH_SHORT).show()

        binding.button.setOnClickListener {
            val intent = Intent(this, NextActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onPause() {
        super.onPause()
        Log.d("Behaviour", "onPause")
        Toast.makeText(this,"onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("Behaviour", "onStop")
        Toast.makeText(this,"onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d("Behaviour", "onSaveInstanceState++")
        Toast.makeText(this,"onSaveInstanceState++", Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("Behaviour", "onSaveInstanceStateBASED")
        Toast.makeText(this,"onSaveInstanceStateBASED", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Behaviour", "onRestart")
        Toast.makeText(this,"onRestart", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Behaviour", "*********onDestroy")
        Toast.makeText(this,"onDestroy", Toast.LENGTH_SHORT).show()
    }
}