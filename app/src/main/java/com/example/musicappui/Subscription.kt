package com.example.musicappui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun Subcription(){
    Column(
        modifier = Modifier.height(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Manage Subscription")
        Card(modifier = Modifier.padding(8.dp),
            elevation = 4.dp
            ){
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Column() {
                    Text(text = "Musical")
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Free Trial")
                        IconButton(onClick = { /*TODO*/ }) {
                            Row {
                                Text(text = "See All Plans")
                                Icon(
                                    imageVector = Icons.Default.KeyboardArrowRight,
                                    contentDescription = ""
                                )
                            }

                        }
                    }
                }
                Divider(modifier =  Modifier.padding(horizontal = 16.dp) , thickness = 2.dp)
                Row(
                    modifier = Modifier.padding(vertical = 16.dp)
                ){
                    Icon(imageVector = Icons.Default.AccountBox, contentDescription = "Get a plan")
                    Text(text = "Get a plan")
                }
            }
        }
    }
}