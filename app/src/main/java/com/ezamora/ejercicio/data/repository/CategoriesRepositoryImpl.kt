package com.ezamora.ejercicio.data.repository

import com.ezamora.ejercicio.data.network.ChuckApi
import com.ezamora.ejercicio.domain.repository.ChuckRepository
import javax.inject.Inject

class CategoriesRepositoryImpl @Inject constructor(
    private val chuckApi: ChuckApi
) : ChuckRepository{
    override suspend fun getCategories(): List<String> {
        return chuckApi.getCategories()
    }

}