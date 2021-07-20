package com.androidstudio.kotlin_databinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private var number = 1
    private val m_contador = MutableLiveData<Int>()
    val contador: LiveData<Int> get() = m_contador

    init {
        m_contador.value = number
    }
    fun clickMe(){
        m_contador.value = ++number
    }
}