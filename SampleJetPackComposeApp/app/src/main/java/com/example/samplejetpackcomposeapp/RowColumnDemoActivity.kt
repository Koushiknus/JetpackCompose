package com.example.samplejetpackcomposeapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.samplejetpackcomposeapp.ui.theme.SampleJetPackComposeAppTheme

class RowColumnDemoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }

    @Composable
    fun MainScreen(){
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            Row( verticalAlignment = Alignment.CenterVertically){
                Button(onClick = {Log.i("Button1","Clicked")}) {
                    Text(text = "Click me 3")
                }
                Button(onClick = { Log.i("Button2","Clicked")}) {
                    Text(text = "Click me 2")
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        SampleJetPackComposeAppTheme {
            MainScreen()
        }
    }
}