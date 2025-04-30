package com.example.borrar_21_04

import androidx.compose.foundation.Image
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.borrar_21_04.ui.theme.Borrar_21_04Theme

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
fun GreetingText(message:String,from:String,segundoParrafo:String,modifier: Modifier = Modifier) {


    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Text(
            text=message,
            fontSize = 24.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
            color = Color.Blue,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = from,
            fontSize = 16.sp,
            color = Color.Black,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.Start)
        )
        Text(
            text = segundoParrafo,
            fontSize = 16.sp,
            color = Color.Black,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.Start)
        )
    }

}
@Composable
fun GreetingImage(message: String,from: String, modifier: Modifier = Modifier){
// painterResource() --> función nativa
    // Accedemos os recursos cunha clase 'R'
    val image = painterResource(R.drawable.bg_compose_background)
    // Se non se escribe 'contentDescription = null' aparecerá como erro o ELEMENTO COMPONIBLE
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Fit,
        alpha = 0.8F
    )
}

@Composable
fun GreetingImageAndText(message: String,from: String,segundoParrafo:String, modifier: Modifier = Modifier){
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        GreetingImage(message, from, modifier)
        GreetingText(message, from,segundoParrafo, modifier)

    }

}

@Preview(showBackground = true,name="Pepe")
@Composable
fun BirthdayCardPreview() {
    Borrar_21_04Theme {
        //En caso de vir da outra práctica, lembrar dar a actualizar
        GreetingImageAndText(
            message = stringResource(R.string.TituloCompose),
            segundoParrafo = stringResource(R.string.TextoMensaxe2),
            from = stringResource(R.string.TextoMensaxe1)
        )
    }
}