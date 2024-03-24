package com.example.homework_m6_1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainViewModel: ViewModel() {

    private var counter = Counter()

    private val _counterValue: MutableLiveData<String> = MutableLiveData(counter.getValue().toString())
    val counterValue: LiveData<String> get() = _counterValue
    fun inc(){
        counter.inc()

        _counterValue.value = counter.getValue().toString()
    }
    fun dec(){
        counter.dec()
        _counterValue.value = counter.getValue().toString()
    }

}