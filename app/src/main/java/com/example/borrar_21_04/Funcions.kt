package com.example.borrar_21_04

import androidx.annotation.FloatRange
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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


    Column(
        modifier = Modifier.background(Color.Red), // Eliminamos weight()
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = message,
            fontSize = 24.sp,
            textAlign = TextAlign.Justify,
            color = Color.Black,
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.Start)
                .background(Color.Gray)

        )

        Text(
            text = segundoParrafo,
            fontWeight = FontWeight(900),
            fontSize = 26.sp,
            color = Color.White,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.Start)

        )
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
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        GreetingImage(message, modifier)
        GreetingText(message, segundoParrafo, modifier)

    }

}

