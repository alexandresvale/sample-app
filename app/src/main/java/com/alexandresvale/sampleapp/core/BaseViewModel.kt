package com.alexandresvale.sampleapp.core

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

open class BaseViewModel(): ViewModel() {

    val disposables = CompositeDisposable()

    override fun onCleared() {
        disposables.clear()
        super.onCleared()
    }
}
