package com.example.activitytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next2)
        Log.d("Behaviour2", "*********onCreate")
        Toast.makeText(this,"onCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("Behaviour2", "---------onStart")
        Toast.makeText(this,"onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("Behaviour2", "onRestoreInstanceStateBased")
        Toast.makeText(this,"onRestoreInstanceStateBased", Toast.LENGTH_SHORT).show()
    }
    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        Log.d("Behaviour2", "onRestoreInstanceState++")
        Toast.makeText(this,"onRestoreInstanceState++", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("Behaviour2", "onResume")
        Toast.makeText(this,"onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("Behaviour2", "onPause")
        Toast.makeText(this,"onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("Behaviour2", "onStop")
        Toast.makeText(this,"onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d("Behaviour2", "onSaveInstanceState++")
        Toast.makeText(this,"onSaveInstanceState++", Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("Behaviour2", "onSaveInstanceStateBASED")
        Toast.makeText(this,"onSaveInstanceStateBASED", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Behaviour2", "onRestart")
        Toast.makeText(this,"onRestart", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Behaviour2", "*********onDestroy")
        Toast.makeText(this,"onDestroy", Toast.LENGTH_SHORT).show()
    }
}