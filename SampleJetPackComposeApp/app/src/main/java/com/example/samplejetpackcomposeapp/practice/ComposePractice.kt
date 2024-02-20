package com.example.samplejetpackcomposeapp.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.samplejetpackcomposeapp.ComposeLayoutBasicsActivity
import com.example.samplejetpackcomposeapp.ComposeLayoutBasicsActivity.User
import com.example.samplejetpackcomposeapp.R
import com.example.samplejetpackcomposeapp.ui.theme.SampleJetPackComposeAppTheme

class ComposePractice : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleJetPackComposeAppTheme{
            }
        }
    }





}