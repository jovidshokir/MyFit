package com.app.myfit.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.app.myfit.ui.theme.MyFitTheme

@Composable
fun ListScreen(name: String) {
    Column (modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        var text by remember {
            mutableStateOf("Type f here")
        }
        TextField(value = text, onValueChange = {
                newText -> text = newText
        }
        )
    }
    //Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun ListScreenPreview() {
    MyFitTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            ListScreen("Android")
        }
    }
}