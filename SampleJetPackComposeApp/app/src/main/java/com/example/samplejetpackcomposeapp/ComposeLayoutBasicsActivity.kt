package com.example.samplejetpackcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class ComposeLayoutBasicsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent()
        }
    }

    data class User(
        val id : Int
    )

    val users = listOf(
        User(1),
        User(2),
        User(3)
    )

    @Composable
    fun MainContent(){
        val user = User(1)
        val users = remember {
            mutableStateListOf(user)
        }
        Box(modifier = Modifier.fillMaxSize()) {
            UserList(users)
            Button(
                modifier = Modifier
                    .padding(24.dp)
                    .align(Alignment.BottomCenter),
                onClick = {
                    users.add(User(1))
                }) {
                Text(text = "Add More")
            }
        }
    }
    @Composable
    fun UserList(users: MutableList<User>) {
     /*   Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            for(i in 1..10){
                UserCard()
            }
        }*/
        LazyColumn{
            items(users){ user->
                UserCard()
            }
        }
    }

    @Composable
    fun UserCard(){
        Card(
            elevation = 4.dp,
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            // Horizontal
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(12.dp)
                    .padding(12.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(120.dp)
                        .clip(CircleShape)
                )

                Column {
                    Text(text = stringResource(id = R.string.app_name))
                    Button(onClick = {
                        //Perform button click
                    }) {
                        Text(text = " View Profile ")

                    }
                }
            }
        }

    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        setContent {
            MainContent()
        }
    }
}