package com.ezamora.ejercicio.data.network

import retrofit2.http.GET

interface ChuckApi {
    @GET("jokes/categories")
    suspend fun getCategories() : List<String>
}