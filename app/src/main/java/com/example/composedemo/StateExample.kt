package com.example.composedemo

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun NotificationScreen(){
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(1f).background(color = Color.White)) {
        NotificationCounter()
    }
}

@Composable
fun NotificationCounter() {
    var count =0
    Column(verticalArrangement = Arrangement.Center) {
        Text(text = "You have send $count notifications")
        Button(onClick = {
            count++
            Log.d("CodeBase","Button Clicked")
        }) {
            Text(text = "Send Notification")
        }
    }

}


