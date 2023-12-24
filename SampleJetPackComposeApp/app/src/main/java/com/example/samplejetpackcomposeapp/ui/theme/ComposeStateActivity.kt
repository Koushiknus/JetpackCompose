package com.example.samplejetpackcomposeapp.ui.theme

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class ComposeStateActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeStateScreen()
        }
    }

    @Composable
    fun ComposeStateScreen() {
        var counter = remember {mutableStateOf(0)}

        var incrementCounter  = {
            counter.value = counter.value + 1
        }
        var decrementCounter  = {
            counter.value = counter.value -1
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(onClick = {
                    incrementCounter.invoke()
                }, modifier = Modifier.padding(5.dp)) {
                    Text(text = "Increment")
                }
                Text(text = "${counter.value}")
                Button(
                    onClick = {
                               decrementCounter.invoke()
                              },
                    modifier = Modifier.padding(5.dp)
                ) {
                    Text(text = "Decrement")
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        setContent {
            ComposeStateScreen()
        }
    }
}