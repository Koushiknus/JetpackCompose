package com.example.samplejetpackcomposeapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class ComposeVMSample : ComponentActivity() {

    private val viewModel by viewModels<ComposeStateViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeStateScreen(viewModel)
        }
    }

    @Composable
    fun ComposeStateScreen(composeStateViewModel: ComposeStateViewModel?) {

        composeStateViewModel?.counter?.observeAsState()?.value
        composeStateViewModel?.error?.observeAsState()?.value?.let {
            Toast.makeText(LocalContext.current,it.toString(),Toast.LENGTH_LONG).show()
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
                    composeStateViewModel?.incrementCounter?.invoke()
                }, modifier = Modifier.padding(5.dp)) {
                    Text(text = "Increment")
                }
                Text(text = "${composeStateViewModel?.counter?.value}")
                Button(
                    onClick = {
                        composeStateViewModel?.decrementCounter?.invoke()
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
            ComposeStateScreen(viewModel)
        }
    }
}