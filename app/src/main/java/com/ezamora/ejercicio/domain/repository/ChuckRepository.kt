package com.ezamora.ejercicio.domain.repository

interface ChuckRepository {
    suspend fun getCategories() : List<String>
}