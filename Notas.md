# Recursos en Jetpack Compose

Los recursos son los archivos adicionales y el contenido estático que usa tu código, como mapas de bits, strings de interfaz de usuario, instrucciones de animación, etc. 

> [!IMPORTANT]
> Siempre debes separar los recursos para apps, como imágenes y strings, de tu código para que puedas mantenerlos de forma independiente.

En tiempo de ejecución, Android utiliza el recurso adecuado según la configuración actual. Por ejemplo, puedes proporcionar un diseño de interfaz de la IU diferente según el tamaño de la pantalla o strings diferentes según la configuración de idioma.

## Cómo agrupar recursos
[Enlace a explicación de documentación de recursos de kotlin](https://developer.android.com/guide/topics/resources/available-resources?hl=es-419)
Siempre debes colocar cada tipo de recurso en un subdirectorio específico del directorio ``res/`` de tu proyecto.

```KOTLIN
MyProject/
    src/
        MyActivity.kt
    res/
        drawable/
            graphic.png
        mipmap/
            icon.png
        values/
            strings.xml
```

Como se ve en este ejemplo, el directorio ``res/`` contiene todos los recursos de los subdirectorios, que incluyen un directorio ``drawable/`` para un recurso de imagen, un directorio ``mipmap/`` para los íconos de selector y un directorio ``values/`` para recursos de strings. 

## Acceso a recursos

Jetpack Compose puede acceder a los recursos definidos en tu proyecto de Android. Se puede acceder a los recursos con los ID de recursos que se generan en la clase R de tu proyecto.

Una clase R es una clase que Android genera automáticamente y que contiene los ID de todos los recursos en el proyecto. 


# 4. Agrega diseño Box


> El diseño ``Box`` es uno de los elementos de diseño estándar en Compose. Usa el diseño ``Box`` para apilar elementos uno sobre el otro. El diseño ``Box`` también te permite configurar la alineación específica de los elementos que contiene.

Para que los cambios se reflejen en el emulador o en un dispositivo, en la función onCreate(), reemplazaremos la llamada a la función GreetingText() por una a GreetingImage().


```Kotlin
setContent {
    HappyBirthdayTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            GreetingImage(
                message = "Happy Birthday Sam!",
                from = "From Emma"
            )
        }
    }
}
```

# 5. Cambia la opacidad y ajusta la imagen

[Enlace da documentación para personalizar imaxes](https://developer.android.com/develop/ui/compose/graphics/images/customize?hl=es-419#content-scale)

## Cómo ajustar la escala del contenido

Hay bastantes tipos de ContentScale disponibles.

Usa el escalamiento del parámetro ContentScale.Crop, que ajusta la escala de la imagen de manera uniforme para mantener la relación de aspecto, de modo que el ancho y el alto de esta sean iguales o mayores a la dimensión correspondiente de la pantalla.

## Cambia la opacidad

Para mejorar el contraste de la app, cambia la opacidad de la imagen de fondo.

Agrega el parámetro alpha al elemento componible Image y establécelo en 0.5F.

## Modificadores de diseño

Los modificadores se usan para decorar o agregar comportamiento a los elementos de IU de Jetpack Compose. Por ejemplo, puedes agregar fondos, padding o comportamiento a filas, texto o botones. Para configurarlos, un elemento componible o un diseño debe aceptar un modificador como parámetro.
Por exemplo ``Modifier.padding``.

# 7. Implementa prácticas recomendadas de código


## Traducción

A la hora de escribir apps, es importante recordar que podrían traducirse a otro idioma. Como aprendiste en un codelab anterior, un tipo de datos String es una secuencia de caracteres, como "Happy Birthday Sam!".

Una string codificada es una que se escribe directamente en el código de tu app. Las strings codificadas hacen que sea más difícil traducir tu app a otros idiomas y dificultan la reutilización de una string en diferentes lugares de la app. Puedes extraer strings en un archivo de recursos para resolver estos problemas. En lugar de codificar strings en tu código, colócalas en un archivo, asígnales un nombre a los recursos de strings y usa los nombres cuando desees usar las strings. El nombre seguirá siendo el mismo, incluso si cambias la string o la traduces a otro idioma.
