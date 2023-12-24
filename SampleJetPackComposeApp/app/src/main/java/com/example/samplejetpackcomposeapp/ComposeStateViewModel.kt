package com.example.samplejetpackcomposeapp


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ComposeStateViewModel : ViewModel() {

    var counter  =  MutableLiveData<Int>(0)

    var incrementCounter  = {
        counter.value = counter.value?.plus(1)
    }
    var decrementCounter  = {
        counter.value = counter.value?.minus(1)
    }
}