package com.example.composedemo.Screens

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.composedemo.Data.Model.Quote
import com.google.gson.Gson
import java.nio.charset.Charset

object DataManager {
    var data = emptyArray<Quote>()
    var isDataLoaded= mutableStateOf(false)
    fun loadAssetsFromFile(context: Context){
        val stream = context.assets.open("quotes.json")
        val size = stream.available()
        val buffer = ByteArray(size)
        stream.read(buffer)
        stream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json,Array<Quote>::class.java)
        isDataLoaded.value= true

    }
}