package com.example.composedemo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(heightDp = 500, device = "spec:parent=pixel_5")
@Composable
fun previewItem(){

    LazyColumn(content = {
        items(getCategoryList()){
            BlogCategory(img = it.img, title = it.title, subTitle = it.subTitle)
        }
    })

    /*Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        getCategoryList().map {
            BlogCategory(img = it.img, title = it.title, subTitle = it.subTitle)
        }
    }*/
}
@Composable
fun BlogCategory(img:Int, title:String, subTitle: String){

    Card(elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        modifier = Modifier.padding(4.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)) {
            Image(painter = painterResource(id = img),
                contentDescription = "app",
                modifier = Modifier
                    .size(48.dp)
                    .padding(6.dp)
                    .weight(.2f))
            ItemDescription(title, subTitle,Modifier.weight(.8f))
        }
    }
}

@Composable
private fun ItemDescription(title: String, subTitle: String,modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodyMedium, fontSize = 16.sp
        )
        Text(
            text = subTitle,
            style = MaterialTheme.typography.bodySmall,
            fontSize = 12.sp
        )
    }
}
data class Category(val img: Int,val title:String, val subTitle :String)

fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.baseline_heart_broken_24,"programming","Learn Different Language"))
    list.add(Category(R.drawable.baseline_heart_broken_24,"Technology","News About new Tech"))
    list.add(Category(R.drawable.baseline_heart_broken_24,"Full stack","From backend to frontEnd"))
    list.add(Category(R.drawable.baseline_heart_broken_24,"DevOps","Deployment CI ,CD etc"))
    list.add(Category(R.drawable.baseline_heart_broken_24,"Ai & ML","Basic Artificial Intelligence"))
    list.add(Category(R.drawable.baseline_heart_broken_24,"programming","Learn Different Language"))
    list.add(Category(R.drawable.baseline_heart_broken_24,"Technology","News About new Tech"))
    list.add(Category(R.drawable.baseline_heart_broken_24,"Full stack","From backend to frontEnd"))
    list.add(Category(R.drawable.baseline_heart_broken_24,"DevOps","Deployment CI ,CD etc"))
    list.add(Category(R.drawable.baseline_heart_broken_24,"Ai & ML","Basic Artificial Intelligence"))
    list.add(Category(R.drawable.baseline_heart_broken_24,"programming","Learn Different Language"))
    list.add(Category(R.drawable.baseline_heart_broken_24,"Technology","News About new Tech"))
    list.add(Category(R.drawable.baseline_heart_broken_24,"Full stack","From backend to frontEnd"))
    list.add(Category(R.drawable.baseline_heart_broken_24,"DevOps","Deployment CI ,CD etc"))
    list.add(Category(R.drawable.baseline_heart_broken_24,"Ai & ML","Basic Artificial Intelligence"))

    return list
}


