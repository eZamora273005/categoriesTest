package com.ezamora.ejercicio.di

import com.ezamora.ejercicio.data.network.ChuckApi
import com.ezamora.ejercicio.data.repository.CategoriesRepositoryImpl
import com.ezamora.ejercicio.domain.repository.ChuckRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    fun providerChuckRepository(
        chuckApi: ChuckApi
    ) : ChuckRepository {
        return CategoriesRepositoryImpl(chuckApi)
    }
}