package com.example.borrar_21_04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.borrar_21_04.ui.theme.Borrar_21_04Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Borrar_21_04Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        message = stringResource(R.string.happy_birthday_text),
                        from = stringResource(R.string.signature_text),
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

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
fun GreetingText(message:String,from:String,modifier: Modifier = Modifier) {

    //En el fragmento de código anterior,
    // observa que se usan llaves en lugar de paréntesis en la función de componibilidad Row.
    // Esto se llama sintaxis de expresión lambda final
    // EN FORMA DE FILA
   /* Row (modifier = modifier) {
        Text(text="$message",fontSize = 25.sp,lineHeight = 96.sp)
        Text(
            text = from,
            fontSize = 30.sp
        )
    }*/
    // EN FORMA DE COLUMNA
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text=message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }

}


@Composable
fun GreetingImage(message: String,from: String, modifier: Modifier = Modifier){

    // painterResource() --> función nativa
    // Accedemos os recursos cunha clase 'R'
    val image = painterResource(R.drawable.androidparty)
    // Se non se escribe 'contentDescription = null' aparecerá como erro o ELEMENTO COMPONIBLE
    Box(modifier){
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        GreetingText(message = stringResource(R.string.happy_birthday_text), from = stringResource(R.string.signature_text),modifier = Modifier)
    }
}

@Preview(showBackground = true,name="Pepe")
@Composable
fun BirthdayCardPreview() {
    Borrar_21_04Theme {
        //En caso de vir da outra práctica, lembrar dar a actualizar
        GreetingImage(
            message = stringResource(R.string.happy_birthday_text),
            from = stringResource(R.string.signature_text)
        )
    }
}