package com.pjurado.ej0202

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import com.pjurado.ej0202.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkBox.setOnClickListener{
            if (binding.checkBox.isChecked()) {
                binding.textView.setVisibility(View.VISIBLE)
            } else {
                binding.textView.setVisibility(View.INVISIBLE)
            }
        }

        binding.radioGroupFondo.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radioButtonFondoRojo -> binding.textView.setBackgroundColor(Color.RED)
                R.id.radioButtonDFondoNegro -> binding.textView.setBackgroundColor(Color.BLACK)
                R.id.radioButtonFondoVerde -> binding.textView.setBackgroundColor(Color.GREEN)
            }
        }

        binding.radioGroupTexto.setOnCheckedChangeListener{ group, checkedId ->
            when (checkedId) {
                R.id.radioButtonTextoAmarillo -> binding.textView.setTextColor(Color.YELLOW)
                R.id.radioButtonTextoAzul -> binding.textView.setTextColor(Color.BLUE)
                R.id.radioButtonTextoBlanco -> binding.textView.setTextColor(Color.WHITE)
            }
        }
    }
}