package com.ezamora.ejercicio.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ezamora.ejercicio.domain.use_cases.CategoriesUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CategoriesViewModel @Inject constructor(
    private val useCases: CategoriesUseCases
) : ViewModel() {
    private var _categories = MutableLiveData<List<String>>()
    val categories : LiveData<List<String>> get() = _categories

    fun getCategories(){
        viewModelScope.launch {
            _categories.value = useCases.invoke()
        }
    }
}