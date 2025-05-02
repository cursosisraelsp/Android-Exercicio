package com.example.borrar_21_04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                    GreetingImageAndText(
                        message = Datos()[0],
                        segundoParrafo = Datos()[1],
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true,name="Pepe")
@Composable
fun BirthdayCardPreview() {
    Borrar_21_04Theme {
        //En caso de vir da outra práctica, lembrar dar a actualizar
        GreetingImageAndText(
            message = stringResource(R.string.AllTasks),
            segundoParrafo = stringResource(R.string.NiceWork)
        )
    }
}
