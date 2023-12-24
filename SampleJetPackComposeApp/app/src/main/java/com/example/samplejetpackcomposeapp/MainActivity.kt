package com.example.samplejetpackcomposeapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.samplejetpackcomposeapp.ui.theme.SampleJetPackComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Greeting(name = "Koushik")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Button(onClick = { Log.i("Test","ButtonClicked") }) {
        Text(text = "Click Me $name!")
    }
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SampleJetPackComposeAppTheme {
        Greeting("Koushik")
    }
}