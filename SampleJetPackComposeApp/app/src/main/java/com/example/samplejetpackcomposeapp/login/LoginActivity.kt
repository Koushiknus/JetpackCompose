package com.example.samplejetpackcomposeapp.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.samplejetpackcomposeapp.ui.theme.SampleJetPackComposeAppTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleJetPackComposeAppTheme {
                // A surface container using the 'background' color from the theme

            }
        }
    }
}

@Composable
fun Greeting3(name: String, modifier: Modifier = Modifier) {

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    SampleJetPackComposeAppTheme {
        Greeting3("Android")
    }
}