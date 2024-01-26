package com.example.samplejetpackcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.samplejetpackcomposeapp.ui.theme.SampleJetPackComposeAppTheme

class StateHoistingActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleJetPackComposeAppTheme {
                // A surface container using the 'background' color from the theme
                StateExample()
            }
        }
    }
}


@Composable
fun Component1(onButtonClick : ()->Unit){

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(text = "This is a header")
        Button(onClick = onButtonClick) {
            Text(text = "Click Me")
        }
    }
}

@Composable
fun Component2(count: Int) {
    Text(text = "Value of Count : ${count}")
}

@Composable
fun StateExample(){
    var counter = rememberSaveable {mutableStateOf(0)}

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Component1{
            counter.value = counter.value + 1
        }
        Component2(counter.value)
    }

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SampleJetPackComposeAppTheme {
        StateExample()
    }
}