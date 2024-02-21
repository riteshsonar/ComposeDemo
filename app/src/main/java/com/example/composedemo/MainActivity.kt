package com.example.composedemo

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
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
@Preview(showBackground = true, widthDp = 200, heightDp = 200)
@Composable
fun PreviewFunction(){
    circularImage()
   /*Text(text = "Hello",
        color = Color.White,
       modifier = Modifier
           .clickable { }
           .background(Color.Blue)
           .size(200.dp)
           .padding(48.dp)
           .border(4.dp, Color.Red)
           .clip(CircleShape)
           .background(Color.Yellow)
           )*/
}
@Composable
fun ListViewItem(imgId: Int, name: String,occupation:String){
    Row(Modifier.padding(8.dp)) {
        Image(painter = painterResource(id = imgId),
            contentDescription = "abc",Modifier.size(40.dp))
        Column (verticalArrangement = Arrangement.SpaceEvenly){
            Text(text = name, fontWeight = FontWeight.Bold)
            Text(text = occupation, fontWeight = FontWeight.Light, fontSize = 14.sp)
        }
    }
}

@Composable
fun circularImage(){
    Image(painter = painterResource(id = R.drawable.baseline_heart_broken_24),
        contentScale  = ContentScale.Crop,
        modifier = Modifier.size(80.dp)
            .clip(CircleShape)
            .border(2.dp, Color.LightGray, CircleShape),contentDescription = "ritesh")
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

