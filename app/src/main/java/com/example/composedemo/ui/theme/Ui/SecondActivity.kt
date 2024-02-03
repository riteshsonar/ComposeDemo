package com.example.composedemo.ui.theme.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composedemo.R

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewFunction()
        }
       // setContentView(R.layout.activity_second)
    }
}

@Preview(showBackground = true, widthDp = 400, heightDp = 400)
@Composable
fun PreviewFunction(){
    //MessageCard("Ritesh")
        Text(text = "Hello")

}