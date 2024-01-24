package com.example.myfistcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfistcompose.ui.theme.MyFistComposeTheme
import java.util.Locale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFistComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Tetuan :)")
                }
            }
        }
    }
}

@Preview(
    name = "Teutle",
    showBackground = true,
    // showSystemUi = true,
    // widthDp = 200,
    // heightDp = 50,
    // apiLevel = 30,
    // locale =
    // device = Devices.NEXUS_5
)
@Composable
fun MyTestSuperText() {
    MySuperText(name = "Tetuan")
}

@Composable
fun MySuperText( name: String ) {
    Text(
        text = "VIVA $name",
        modifier = Modifier
            .fillMaxWidth()
            // .padding( start = 20.dp, end = 20.dp, top = 20.dp )
            .padding( all = 20.dp )
            .clickable {  } // TODO componente es clickable
                // .fillMaxHeight()
                // .fillMaxSize() // Ocupa todo ancho y alto
                //.width(200.dp)
                //.height(50.dp)
            )
}

/** Arquitectura Basica.
 * ui.theme -> {
 * * Color.kt -> Variables del color que ocuparemos en la app.
 * * Theme.kt -> Configuracion del tema de nuestra app
 * * Type.kt -> Typografia que usaremos en la app
 * */

/** Previews
 * * Limitaciones .- No se puede previsualizar la vista si la funcion recibe para metros pero,
 * podemos usar una funcion TEST para renderizarla.
 * */

/** Modificadores.
 * Objeto que nos permite modificar nuestros componentes,
 * Cada componente tiene un modifier inicializado por defecto.
 * Modifier tiene una arquitectura Builder
 * */