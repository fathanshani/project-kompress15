package com.surendramaran.yolov8tflite

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.surendramaran.yolov8tflite.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fab.setOnClickListener { startCameraX() }

        binding.btnRead1.setOnClickListener {
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_DESCRIPTION, binding.tvDescription1.text.toString())
            intent.putExtra(DetailActivity.CODE_RESULT, 100)
            startActivity(intent)
        }

        binding.btnRead2.setOnClickListener {
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_DESCRIPTION, binding.tvDescription2.text.toString())
            intent.putExtra(DetailActivity.CODE_RESULT, 200)
            startActivity(intent)
        }
    }

    private fun startCameraX() {
        val intent = Intent(this@MainActivity, CameraActivity::class.java)
        startActivity(intent)
    }
}
