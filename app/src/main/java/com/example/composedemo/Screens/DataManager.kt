package com.example.composedemo.Screens

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.composedemo.Data.Model.Quote
import com.example.composedemo.ui.theme.Ui.Pages
import com.google.gson.Gson

object DataManager {
    var data = emptyArray<Quote>()
    var currentQuote : Quote? = null

    var isDataLoaded= mutableStateOf(false)
    var currentPage = mutableStateOf(Pages.LISTING)
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

    fun switchPages(quote: Quote?){
        if (currentPage.value ==Pages.LISTING){
            currentQuote = quote
            currentPage.value=Pages.DETAIL
        }else{
            currentPage.value= Pages.LISTING
        }
    }
}