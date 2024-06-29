package com.ezamora.ejercicio.domain.use_cases

import com.ezamora.ejercicio.domain.repository.ChuckRepository
import javax.inject.Inject

class CategoriesUseCases @Inject constructor(
    private val repository: ChuckRepository
){
    suspend fun invoke() : List<String> {
        return repository.getCategories()
    }
}