package com.surendramaran.yolov8tflite

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.surendramaran.yolov8tflite.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val detail = intent.getStringExtra(EXTRA_DESCRIPTION)
        val codeResult = intent.getIntExtra(CODE_RESULT, -1)

        if (codeResult == 100) {
            binding.titleJeruk.text = getString(R.string.jeruk_segar)
            binding.titleJeruk.background = getDrawable(R.drawable.bg_green_rounded)
            binding.descJeruk.text = detail
            binding.imageView.setImageResource(R.drawable.ic_fruit)
        } else if (codeResult == 200) {
            binding.titleJeruk.text = getString(R.string.jeruk_busuk)
            binding.titleJeruk.background = getDrawable(R.drawable.bg_red_rounded)
            binding.descJeruk.text = detail
            binding.imageView.setImageResource(R.drawable.fruit_salad_cuate)
        }
    }

    companion object {
        const val EXTRA_DESCRIPTION = "extra_description"
        const val CODE_RESULT = "code_result"
    }
}
