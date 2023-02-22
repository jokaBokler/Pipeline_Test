package com.example.activitytest

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.activitytest.ui.theme.ActivityTestTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Behaviour", "*********onCreateBASED")
        Toast.makeText(this,"onCreateBASED", Toast.LENGTH_SHORT).show()
        setContent {
            ActivityTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
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

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ActivityTestTheme {
        Greeting("Android")
    }
}