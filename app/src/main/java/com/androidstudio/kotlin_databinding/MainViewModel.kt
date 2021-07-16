package com.androidstudio.kotlin_databinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val m_contador = MutableLiveData<Int>()
    val contador: LiveData<Int> get() = m_contador

}