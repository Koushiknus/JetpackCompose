package com.example.samplejetpackcomposeapp.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.saveable.rememberSaveable
import com.example.samplejetpackcomposeapp.ComposeLayoutBasicsActivity
import com.example.samplejetpackcomposeapp.ComposeLayoutBasicsActivity.User
import com.example.samplejetpackcomposeapp.R

class ComposePractice : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent()
        }
    }


    @Composable
    fun MainContent(){
        val user = User(1)
        val users  = rememberSaveable {
            mutableStateListOf(user)
        }
    }
    @Composable
    fun UserList(users: MutableList<User>){
        LazyColumn{
            items(users){ user->

            }
        }
    }

    @Composable
    fun UserCard(){

    }


}