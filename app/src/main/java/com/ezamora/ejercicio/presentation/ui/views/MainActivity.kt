package com.ezamora.ejercicio.presentation.ui.views

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.ezamora.ejercicio.R
import com.ezamora.ejercicio.databinding.ActivityMainBinding
import com.ezamora.ejercicio.presentation.ui.adapters.CategoriesAdapter
import com.ezamora.ejercicio.presentation.viewmodel.CategoriesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel : CategoriesViewModel by viewModels()
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private lateinit var adapter : CategoriesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
        fetchCategories()
        observer()
    }

    private fun observer() {
        viewModel.categories.observe(this, ::getCategories)
    }

    private fun getCategories(category : List<String>){
        adapter.categoriesList = category
        binding.rvCategories.adapter = adapter
    }

    private fun initView() = with(binding) {
        rvCategories.layoutManager = LinearLayoutManager(this@MainActivity)
        adapter = CategoriesAdapter()
    }

    private fun fetchCategories() {
        viewModel.getCategories()
    }
}