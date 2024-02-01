package com.example.composedemo

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.MutableLiveData
import com.example.composedemo.ui.theme.ComposeDemoTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewFunction()
        }
    }
}
@Preview(showBackground = true, widthDp = 400, heightDp = 400)
@Composable
fun PreviewFunction(){
    //MessageCard("Ritesh")
    Button(onClick = {  }) {
        Text(text = "Hello")
    }

}
@Composable
fun TextInput(){
    val state= remember{mutableStateOf("")}
    state.value?.let {
        TextField(value = state.value,
        onValueChange = {
            state.value= it
            Log.d("aaa",it)
        },
        label = { Text(text = "Enter Message")})
    }
}

@Composable
fun MessageCard(name: String) {
    Text(text = "Hello $name!")
}
@Composable
fun showTextValue(){
    Text(text = "user follower", color = Color.Blue, textAlign = TextAlign.Center)
}

