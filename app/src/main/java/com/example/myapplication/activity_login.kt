package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text
import kotlin.time.Duration

class activity_login : AppCompatActivity() {
    val TAG="Loginactivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        display(msg = "onCreate method is called")
    }

    override fun onStart() {
        display("Onstart method is called")
        super.onStart()
    }

    override fun onPause() {
        display("OnPause method is called")
        super.onPause()
    }

    override fun onStop() {
        display("OnStop method is called")
        super.onStop()
    }

    override fun onResume() {
        display("OnResume method is called")
        super.onResume()
    }

    override fun onDestroy() {
        display("OnDestory method is called")
        super.onDestroy()
    }

    override fun onRestart() {
        display("OnRestart method is called")
        super.onRestart()
    }
    fun display(msg: String){
        Log.i(TAG, msg)
        Toast.makeText(this, msg,Toast.LENGTH_LONG).show()
    }
}
