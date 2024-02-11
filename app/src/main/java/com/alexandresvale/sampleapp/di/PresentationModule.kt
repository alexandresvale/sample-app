package com.alexandresvale.sampleapp.di

import com.alexandresvale.sampleapp.ui.MainViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel {
        MainViewModel(
            getPokemonUseCase = get(),
            uiScheduler = AndroidSchedulers.mainThread()
        )
    }
}