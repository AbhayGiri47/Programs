package com.example.gitbase

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.gitbase.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("lifecycle", "onCreate invoked")

        binding.btnOpenDialog.setOnClickListener {
            val builder = AlertDialog.Builder(this)
                .setMessage("Dialog Opened")
                .setPositiveButton("Yes",null)
                .setNegativeButton("No", null)
                .setCancelable(false)
            builder.create().show()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("lifecycle", "onStart invoked")
    }

    override fun onResume() {
        super.onResume()
        Log.d("lifecycle", "onResume invoked")
    }

    override fun onPause() {
        super.onPause()
        Log.d("lifecycle", "onPause invoked")
    }

    override fun onStop() {
        super.onStop()
        Log.d("lifecycle", "onStop invoked")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("lifecycle", "onRestart invoked")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lifecycle", "onDestroy invoked")
    }
}