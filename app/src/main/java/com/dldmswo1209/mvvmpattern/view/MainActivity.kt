package com.dldmswo1209.mvvmpattern.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.dldmswo1209.mvvmpattern.R
import com.dldmswo1209.mvvmpattern.RecyclerAdapter
import com.dldmswo1209.mvvmpattern.databinding.ActivityMainBinding
import com.dldmswo1209.mvvmpattern.model.Todo
import com.dldmswo1209.mvvmpattern.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val viewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }

}