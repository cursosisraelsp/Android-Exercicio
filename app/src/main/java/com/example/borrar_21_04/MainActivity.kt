package com.example.borrar_21_04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
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
                    GreetingText(message = "Happy Birthday Sam!", from = "From Emma",modifier = Modifier.padding(8.dp))
                }
            }
        }
    }
}
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
            .fillMaxSize()
            .padding(8.dp), // si quieres mantener el padding
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
    Text(
        text="$message",
        fontSize = 100.sp,
        lineHeight = 116.sp,
        textAlign = TextAlign.Center)
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }

}
/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
*/

@Preview(showBackground = true,name="Pepe")
@Composable
fun BirthdayCardPreview() {
    Borrar_21_04Theme {
        GreetingText(message = "Happy Birthday Sam!", from = "From Emma")
    }
}