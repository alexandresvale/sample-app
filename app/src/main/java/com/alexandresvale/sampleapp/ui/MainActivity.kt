package com.alexandresvale.sampleapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.alexandresvale.sampleapp.R
import com.alexandresvale.sampleapp.core.ViewState
import com.alexandresvale.sampleapp.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModel()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.mainViewModel = viewModel
        binding.lifecycleOwner = this

        setupViewModel()
    }

    private fun setupViewModel() {
        viewModel.showPokemonListLiveDate.observe(this, Observer {
            when(it) {
                true -> { Log.d("####", "showPokemonListLiveDate if $it") }
                else -> { Log.d("####", "showPokemonListLiveDate else $it") }
            }
        })

        viewModel.outAppLiveData.observe(this, Observer{
            Log.d("####", "outAppLiveData $it")
        })

        viewModel.getPokemons(forceUpdate = false)
        viewModel.state.observe(this, Observer { viewState ->
            when(viewState) {
                is ViewState.Loading -> {
                    Log.d("####", "state loading")
                }
                is ViewState.Success -> {
                    Log.d("####", "state size = ${viewState.data.size}")
                    viewState.data.forEach {
                        Log.d("####", "state sucess = ${it.name}")
                    }
                }
                is ViewState.Failed -> {
                    Log.d("####", "state failed = ${viewState.throwable.message}")
                }
            }
        })
    }
}