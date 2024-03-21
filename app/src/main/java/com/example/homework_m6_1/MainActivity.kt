package com.example.homework_m6_1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.homework_m6_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    private val viewModel: MainViewModel by lazy {
//        ViewModelProvider(this)[MainViewModel::class.java]
//    }
    private lateinit var viewModel: MainViewModel
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        init()
        observeViewModel()
    }
    private fun init() {
        with(binding) {
            buttonInc.setOnClickListener {
                viewModel.inc()
            }
            buttonDec.setOnClickListener {
                viewModel.dec()
            }
            tvResult.isEnabled = false
        }
    }
    private fun observeViewModel() {
        viewModel.counterValue.observe(this) { value ->
            binding.tvResult.text = value
        }
    }

}