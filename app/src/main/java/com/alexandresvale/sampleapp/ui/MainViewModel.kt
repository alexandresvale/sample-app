package com.alexandresvale.sampleapp.ui

import androidx.lifecycle.MutableLiveData
import com.alexandresvale.domain.di.useCaseModule
import com.alexandresvale.domain.model.Pokemon
import com.alexandresvale.domain.useCase.GetPokemonUseCase
import com.alexandresvale.sampleapp.core.BaseViewModel
import com.alexandresvale.sampleapp.core.StateMachineSingle
import com.alexandresvale.sampleapp.core.ViewState
import io.reactivex.Scheduler
import io.reactivex.rxkotlin.plusAssign
import io.reactivex.schedulers.Schedulers

class MainViewModel(
    val getPokemonUseCase: GetPokemonUseCase,
    val uiScheduler: Scheduler
): BaseViewModel() {
    val showPokemonListLiveDate = MutableLiveData<Boolean>()
    val outAppLiveData = MutableLiveData<Boolean>()

    val state = MutableLiveData<ViewState<List<Pokemon>>>().apply {
        value = ViewState.Loading
    }

    fun onShowPokemonListRequire() {
        showPokemonListLiveDate.postValue(true)
    }

    fun onOutAppLiveData() {
        outAppLiveData.postValue(true)
    }

    fun getPokemons(forceUpdate: Boolean = false) {
        disposables += getPokemonUseCase.invoke(forceUpdate)
            .compose(StateMachineSingle())
            .observeOn(uiScheduler)
            .subscribeOn(Schedulers.io())
            .subscribe(
                {
                    state.postValue(it)
                },
                {
                    state.postValue(ViewState.Failed(it))
                }
            )
    }
}