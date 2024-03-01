package com.example.composedemo.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composedemo.Data.Model.Quote
import com.example.composedemo.R

@Composable
fun QuoteListScreen(data: Array<Quote>, onClick: () -> Unit){
    Column {
        Text(text = "Quote App",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(8.dp,24.dp)
                    .fillMaxWidth(1f),
                style = MaterialTheme.typography.bodyMedium,
                fontFamily = FontFamily(Font(R.font.poppins_regular))
        )
        QuoteList(data = data) {
            onClick()
        }
    }

}