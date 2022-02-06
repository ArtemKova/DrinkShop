package com.ka.drinkshop.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.ka.drinkshop.R


class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider.AndroidViewModelFactory(application).create(MainViewModel::class.java)
        viewModel.drinkList.observe(this){

            Log.d("MainActivityTest", it.toString())
        }
        viewModel.getDrinkList()
    }


}