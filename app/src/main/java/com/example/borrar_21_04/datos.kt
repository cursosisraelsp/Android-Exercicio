package com.example.borrar_21_04

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

@Composable
fun Datos():Array<String>{
    val datos = arrayOf(stringResource(R.string.happy_birthday_text),stringResource(R.string.TextoMensaxe1), stringResource(R.string.TextoMensaxe2))
    return datos
}
