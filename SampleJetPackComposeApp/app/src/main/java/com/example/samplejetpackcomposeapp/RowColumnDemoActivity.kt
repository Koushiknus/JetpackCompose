package com.example.samplejetpackcomposeapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.samplejetpackcomposeapp.ui.theme.SampleJetPackComposeAppTheme

class RowColumnDemoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }

    @Composable
    fun MainScreen() {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly) {
                Button(onClick = {
                    Log.i("Button1", "Clicked")
                }, modifier = Modifier.padding(5.dp)) {
                    Text(text = "Click me 3")
                }
                Text(text = "0")
                Button(
                    onClick = { Log.i("Button2", "Clicked") },
                    modifier = Modifier.padding(5.dp)
                ) {
                    Text(text = "Click me 2")
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        setContent {
            MainScreen()
        }
    }
}