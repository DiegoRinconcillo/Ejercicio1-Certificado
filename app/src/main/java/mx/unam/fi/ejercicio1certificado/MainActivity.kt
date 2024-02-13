package mx.unam.fi.ejercicio1certificado

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mx.unam.fi.ejercicio1certificado.R.drawable.android_image
import mx.unam.fi.ejercicio1certificado.ui.theme.Ejercicio1CertificadoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ejercicio1CertificadoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    CertificateCourse("Diego Rodríguez Rinconcillo", "Jetpack Compose Básico")
                }
            }
        }
    }
}

@Composable
fun CertificateCourse(name: String,course : String, modifier: Modifier = Modifier) {

    Column(
        modifier= modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement=Arrangement.Center
    ){
        Row(modifier=modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround){

            Image(painter = painterResource(id = R.drawable.escudo_unam),
                contentDescription =null,
                modifier = modifier.size(50.dp,50.dp))

            Text(
                text = "UNAM",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                textAlign= TextAlign.Center,
                modifier = modifier)

            Image(painter = painterResource(id = R.drawable.escudo_fi_color),
                contentDescription =null,
                modifier = modifier.size(50.dp,50.dp))

        }
        Spacer(modifier =modifier.height(10.dp))
        Text(
            text = "This certificate is presented to:",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            textAlign= TextAlign.Center,
            modifier = modifier.fillMaxWidth())
        Box(
            contentAlignment = Alignment.Center,
            modifier=modifier
                .fillMaxWidth()
        ){
            Image(painter=painterResource(id = R.drawable.android_image),
                alpha=0.3F,
               contentDescription=null,
               modifier = modifier.fillMaxWidth()
            )
            Text(
                text = name,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                textAlign= TextAlign.Center,
                modifier = modifier
                    .fillMaxWidth()
            )
        }
        Text(
            text = "Ha completado de manera exitosa 2 horas de curso!",
            textAlign= TextAlign.Center,
            modifier = modifier
                .fillMaxWidth()
        )
        Text(
            text = course,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            textAlign= TextAlign.Center,
            modifier = modifier
                .fillMaxWidth()
        )
        Spacer(modifier =modifier.height(20.dp))

        Row(modifier=modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround){
            Image(painter = painterResource(id = R.drawable.firma_1),
                contentDescription =null,
                modifier = modifier.size(70.dp,50.dp))
            Image(painter = painterResource(id = R.drawable.firma_2),
                contentDescription =null,
                modifier = modifier.size(70.dp,50.dp))
        }
        Row(modifier=modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround){
            Text(
                text = "Jefe de la Empresa",
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier
            )
            Text(
                text = "Profesor del Curso",
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier
            )

        }
    }
    }



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ejercicio1CertificadoTheme {
        CertificateCourse("Diego Rodríguez Rinconcillo", "Jetpack Compose Básico")
    }
}