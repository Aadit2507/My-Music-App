package com.example.musicappui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicappui.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@Composable
fun AccountView(){
   Card(
       modifier = Modifier.height(170.dp)
           .fillMaxWidth()
           .padding(16.dp),
       elevation = 5.dp
   ) {
       Column(
           modifier = Modifier
               .fillMaxSize()
               .padding(16.dp)
       ){

           Row (
               modifier = Modifier,
               horizontalArrangement = Arrangement.SpaceBetween
           ){
               Row() {
                   Icon(
                       imageVector = Icons.Default.AccountCircle,
                       contentDescription = "Account",
                       modifier = Modifier.padding(end = 8.dp)
                   )
                   Column {
                       Text("Aadit Sharma")
                       Text("@aadit25")
                   }
               }
               IconButton(onClick = { /*TODO*/ } , modifier = Modifier.padding(start = 200.dp)) {
                   Icon(
                       imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                       contentDescription = ""
                   )
               }
           }
           Divider(thickness = 2.dp , modifier = Modifier.padding(horizontal = 8.dp , vertical = 8.dp))

           Row(modifier = Modifier.padding(top = 16.dp)){
               Icon(painter =  painterResource(id = R.drawable.baseline_library_music_24),
                   contentDescription =  "My Music",
                   modifier = Modifier.padding(end = 8.dp)
               )
               Text("My Music")
           }

         //  Divider(thickness = 2.dp , modifier = Modifier.padding(horizontal = 8.dp , vertical = 8.dp))

       }

   }

}
