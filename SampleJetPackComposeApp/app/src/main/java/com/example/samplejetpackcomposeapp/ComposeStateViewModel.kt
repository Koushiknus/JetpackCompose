package com.example.samplejetpackcomposeapp


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ComposeStateViewModel : ViewModel() {

    var counter  =  MutableLiveData<Int>(0)

    var error = MutableLiveData<String>()

    var incrementCounter  = {
        counter.value = counter.value?.plus(1)
    }
    var decrementCounter  = {
        if(counter.value ==0){
           if(error.value == null){
               error.value = "Value cannot be lesss than zero"
           }
        }else{
            counter.value = counter.value?.minus(1)

        }
    }
}