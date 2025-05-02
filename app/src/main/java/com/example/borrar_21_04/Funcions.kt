package com.example.borrar_21_04

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


//#### FUNCIONS DE COMPONIBILIDADE

@Composable
fun GreetingText(message:String,segundoParrafo:String,modifier: Modifier = Modifier) {



    Column(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxHeight(1f)
            .padding(10.dp)
    ) {

        Box(
            Modifier
                .fillMaxHeight(0.5f)
                .fillMaxWidth(1f)
                .background(Color.Black)
        ){
            Row(
                Modifier
                    .background(color = Color.White)
                    .fillMaxWidth(1f)
                    .fillMaxHeight(1f)
            ){
                Box(
                    Modifier
                        .background(color = Color.Yellow)
                        .fillMaxWidth(0.5f)
                        .fillMaxHeight(1f)
                ){
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(1f)
                            .padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                             fontWeight = FontWeight.W900,
                            text = "Text composable")
                        Text(text = "Displays text and follows the recommended Material Design guidelines.")
                    }

                }
                Box(
                    Modifier
                        .background(color = Color.Green)
                        .fillMaxWidth(1f)
                        .fillMaxHeight(1f)
                ){
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(1f)
                            .padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(fontWeight = FontWeight.W900,text = "Image composable")
                        Text(text = "Creates a composable that lays out and draws a given Painter class object.")
                    }
                }
            }
        }
        Box(
            Modifier
                .fillMaxHeight(1f)
                .fillMaxWidth(1f)
                .background(Color.White)

        ){
            Row(
                Modifier
                    .background(color = Color.Green)
                    .fillMaxWidth(1f)
                    .fillMaxHeight(1f)

            ){
                Box(
                    Modifier
                        .background(color = Color.Blue)
                        .fillMaxWidth(0.5f)
                        .fillMaxHeight(1f)

                ){
                    Column (
                        modifier = Modifier
                            .fillMaxHeight(1f)
                            .padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ){
                        Text(modifier = Modifier.padding(16.dp),fontWeight = FontWeight.W900,color = Color.White,text = "Row composable")
                        Text(color = Color.White,text = "A layout composable that places its children in a horizontal sequence.")
                    }
                }
                Box(
                    Modifier
                        .background(color = Color.Cyan)
                        .fillMaxWidth(1f)
                        .fillMaxHeight(1f)
                ){
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(1f)
                            .padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(modifier = Modifier.padding(end = 16.dp),fontWeight = FontWeight.W900,color = Color.Red,
                            text = "Column composable")
                        Text(text = "A layout composable that places its children in a vertical sequence.")
                    }
                }
            }
        }


    }




}


@Composable
fun GreetingCuadriculas(message: String,segundoParrafo:String, modifier: Modifier = Modifier){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .fillMaxHeight(1f)
    ){

        GreetingText(message, segundoParrafo, modifier)


    }


}

