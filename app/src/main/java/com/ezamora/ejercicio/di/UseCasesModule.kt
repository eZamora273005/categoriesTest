package com.ezamora.ejercicio.di

import com.ezamora.ejercicio.domain.repository.ChuckRepository
import com.ezamora.ejercicio.domain.use_cases.CategoriesUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object UseCasesModule {
    @Provides
    fun providerChuckCategoriesUseCase(
        chuckRepository: ChuckRepository
    ) : CategoriesUseCases {
        return CategoriesUseCases(chuckRepository)
    }
}