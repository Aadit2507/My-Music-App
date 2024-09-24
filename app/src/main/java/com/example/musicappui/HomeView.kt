package com.example.musicappui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Home(){
 val categories = listOf("Hits" ,"Happy" , "WorkOut" ,"Running" ,"TGIF" , "YOGA" )
    val grouped = listOf<String>(
        "New Releases","Favourites","Trending Now"," Top Rated"
    ).groupBy { it[0]}
    LazyColumn {
        grouped.forEach{
            stickyHeader {
                Text(text = it.value[0] , modifier = Modifier.padding(16.dp) ,  style = MaterialTheme.typography.h6)
                LazyRow {
                    items(categories){
                        cat->
                        BrowserItem(cat = cat , drawable = R.drawable.baseline_music_note_24)
                    }

                }
            }
        }
    }
}
@Composable
fun BrowserItem(cat : String , drawable : Int){
Card(modifier = Modifier.padding(16.dp).size(200.dp),
    elevation = 4.dp,
    border = BorderStroke(1.dp, Color.LightGray)
) {
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(text = cat)
        Image(painter = painterResource(id = drawable), contentDescription = cat)
    }
}
}