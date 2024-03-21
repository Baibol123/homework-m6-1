package com.example.homework_m6_1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainViewModel: ViewModel() {

    private var counter = Counter()
    private val _counterValue: MutableLiveData<String> = MutableLiveData(counter.getValue().toString())
    val counterValue: LiveData<String> get() = _counterValue
    private val _editCounter = MutableLiveData<Int>()
    init {
        _editCounter.value = counter.getValue()
    }
    val editCounter: LiveData<Int> get() = _editCounter
    fun inc(){
        counter.inc()

        _editCounter.value = counter.getValue()
    }
    fun dec(){
        counter.dec()
        _editCounter.value = counter.getValue()
    }

}