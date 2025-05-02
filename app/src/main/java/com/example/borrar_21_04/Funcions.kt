package com.example.borrar_21_04

import androidx.annotation.FloatRange
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//#### FUNCIONS DE COMPONIBILIDADE
/*
* Cada función de componibilidad debe aceptar un parámetro Modifier opcional.
* Los modificadores le indican a un elemento de la IU cómo aparecer o comportarse en su diseño de nivel superior.
* */
//#### ELEMENTOS COMPONIBLES

/*
* Son os elementos 'funcions' que corresponden a Row,Column,Text,Image
* */
@Composable
fun GreetingText(message:String,segundoParrafo:String,modifier: Modifier = Modifier) {


    /*Column(
        modifier = Modifier.background(Color.Red).width(370.dp), // Eliminamos weight()
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }*///
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

        /*Row(modifier= Modifier
            .fillMaxHeight(1f)
            .fillMaxWidth(1f)){
            Text(text = message,
                fontSize = 24.sp,
                textAlign = TextAlign.Justify,
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight(1f)
                    .background(Color.Cyan)

            )
            Text( text = segundoParrafo,
                fontWeight = FontWeight(900),
                fontSize = 26.sp,
                color = Color.White,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .fillMaxHeight(1f)
                    .background(Color.Magenta))

        }*/
    }
    /*Column(
        modifier = Modifier.background(Color.Yellow).fillMaxHeight(1f),
        //horizontalAlignment = Alignment.CenterHorizontally
        //verticalArrangement = Arrangement.Center
    ) {

        Row(
            modifier= Modifier
                .fillMaxHeight(1f)
                .fillMaxWidth(1f)
                .background(Color.Red)
        ){
            Text(text = message,
                fontSize = 24.sp,
                textAlign = TextAlign.Justify,
                color = Color.Black,
                modifier = Modifier
                    .padding(0.dp)
                    .background(Color.Gray)
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight(1f)
            )
            Text( text = segundoParrafo,
                fontWeight = FontWeight(900),
                fontSize = 26.sp,
                color = Color.White,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(0.dp)
                    .fillMaxWidth(1f)
                    .fillMaxHeight(1f)
                    .background(Color.Blue)
            )
        }

    }*/




}
@Composable
fun GreetingImage(message: String, modifier: Modifier = Modifier){
// painterResource() --> función nativa
    // Accedemos os recursos cunha clase 'R'
    val image = painterResource(R.drawable.ic_task_completed)
    // Se non se escribe 'contentDescription = null' aparecerá como erro o ELEMENTO COMPONIBLE
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Fit,

        alpha = 1F
    )
}

@Composable
fun GreetingImageAndText(message: String,segundoParrafo:String, modifier: Modifier = Modifier){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .fillMaxHeight(1f),
        //verticalArrangement = Arrangement.SpaceBetween,
        //horizontalAlignment = Alignment.CenterHorizontally
    ){
       // GreetingImage(message, modifier)
        GreetingText(message, segundoParrafo, modifier)


    }


}

