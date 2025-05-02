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

    }*/
    Column(
        modifier = Modifier.background(Color.Green).fillMaxHeight(0.5f),
        //horizontalAlignment = Alignment.CenterHorizontally
        verticalArrangement = Arrangement.Center
    ) {
        val rectangleHeight = 100.dp
        Box(Modifier.size(rectangleHeight).weight(weight = 3.0F, fill = true).background(Color.Blue), content = {
            Text(text = message,
                fontSize = 24.sp,
                textAlign = TextAlign.Justify,
                color = Color.Black,
                modifier = Modifier
                    .padding(0.dp)
                    .background(Color.Gray)
            )
            Text( text = segundoParrafo,
                fontWeight = FontWeight(900),
                fontSize = 26.sp,
                color = Color.White,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(0.dp)

                    .background(Color.Blue))
        })

        Row(
            content = {
                Text(text = message,
                    fontSize = 24.sp,
                    textAlign = TextAlign.Justify,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(0.dp)
                        .background(Color.Cyan)
                        .weight(weight = 1.0F, fill = true)
                        )
                Text( text = segundoParrafo,
                    fontWeight = FontWeight(900),
                    fontSize = 26.sp,
                    color = Color.White,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier
                        .padding(0.dp)
                        .weight(weight = 1.0F, fill = true)
                        .background(Color.Magenta))

            }
        )
    }
    Column(
        modifier = Modifier.background(Color.Yellow).fillMaxHeight(1f),
        //horizontalAlignment = Alignment.CenterHorizontally
        verticalArrangement = Arrangement.Center
    ) {
        val rectangleHeight = 100.dp
        Box(
            Modifier
                .weight(weight = 0.3F, fill = true)
                .background(Color.Red)
                .fillMaxWidth(0.5f)
        ){
            Text(text = message,
                fontSize = 24.sp,
                textAlign = TextAlign.Justify,
                color = Color.Black,
                modifier = Modifier
                    .padding(0.dp)
                    .background(Color.Gray)
            )
            Text( text = segundoParrafo,
                fontWeight = FontWeight(900),
                fontSize = 26.sp,
                color = Color.White,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(0.dp)

                    .background(Color.Blue))
        }

        Row(Modifier
            .weight(weight = 0.3F, fill = true)
            .background(Color.DarkGray)){
            Text(text = message,
                fontSize = 24.sp,
                textAlign = TextAlign.Justify,
                color = Color.Black,
                modifier = Modifier
                    .padding(0.dp)
                    .background(Color.Cyan)
                    .weight(weight = 1.0F, fill = true)
            )
            Text( text = segundoParrafo,
                fontWeight = FontWeight(900),
                fontSize = 26.sp,
                color = Color.White,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(0.dp)
                    .weight(weight = 1.0F, fill = true)
                    .background(Color.Magenta))

        }
    }




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
            .fillMaxSize().background(color = Color.Black),
        //verticalArrangement = Arrangement.SpaceBetween,
        //horizontalAlignment = Alignment.CenterHorizontally
    ){
       // GreetingImage(message, modifier)
        GreetingText(message, segundoParrafo, modifier)

    }

}

