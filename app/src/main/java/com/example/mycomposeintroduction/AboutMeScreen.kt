package com.example.mycomposeintroduction


import android.graphics.Color.rgb
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

@Preview
@Composable
fun AboutMeScreen (
    modifier: Modifier = Modifier
) = Surface(color = (Color(rgb(110, 1, 82)).copy(alpha = 0.2f))){
    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Row(modifier = Modifier
            .weight(.2f)
            .fillMaxSize()) {
            AboutHeader(modifier = Modifier.fillMaxSize())
            }
        Row(modifier = Modifier
            .weight(.5f)
            .fillMaxSize()) {
            AboutFooter(modifier = Modifier.fillMaxSize())
        }
    }
}




@Composable
fun AboutFooter (modifier: Modifier) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Sono una appassionata di tecnologia, \n" +
                    "ho di recente intrapreso un percorso di studio \n" +
                    "sulla programmazione ed i suoi linguaggi.\n" +
                    "Ho partecipato ad eventi come il GDG DevFest,\n" +
                    "il Bootcamp Puglia Women Code,\n" +
                    "dove ho avuto modo di osservare più da vicino \n" +
                    "questo mondo, conoscendo e ascoltando gli sviluppatori\n" +
                    "degli ambiti più disparati. \n" +
                    "Sono convinta di voler intraprendere un percorso\n" +
                    "nell’IT vista la mia creatività e la mia voglia \n" +
                    "di conoscere ancora più a fondo un mondo \n" +
                    "sempre in evoluzione.\n",
            color = Color.Gray,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(all = 8.dp)
                .align(Alignment.CenterHorizontally),
            fontFamily = secondFont
        )
        
    }
}
    
@Composable
fun AboutHeader(modifier: Modifier){
    Column(modifier = modifier, verticalArrangement = Arrangement.Center) {
        Row(modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight()
            .align(Alignment.CenterHorizontally)
            .background(Color.White.copy(alpha = 0.2F)),
        ) {
            Text(
                text = "CHI SONO",
                color = Color.Gray,
                fontWeight = FontWeight.Light,
                fontSize = 70.sp,
                modifier = Modifier
                    .align(alignment = Alignment.CenterVertically)
                    .padding(start = 28.dp)
                    ,
                fontFamily = secondFont)
        }
        
    }
}
