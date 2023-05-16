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
) = Surface(color = (Color(rgb(110, 1, 82)))){
    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Row(modifier = Modifier
            .weight(.1f)
            .fillMaxSize()) {
            AboutMe(modifier = Modifier.fillMaxSize())
            }
        Row(modifier = Modifier
            .weight(.4f)
            .fillMaxSize()) {
            AboutMeDescription(modifier = Modifier.fillMaxSize())
        }
        Row(modifier = Modifier
            .weight(.1f)
            .wrapContentSize()) {
            HardSkills(modifier = Modifier)
        }
        Row(modifier = Modifier
            .weight(.4f)
            .fillMaxSize()) {
            HardSkillsDescription(modifier = Modifier.fillMaxSize())
        }
    }
}




@Composable
fun AboutMeDescription (modifier: Modifier) {
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
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 8.dp)
                .align(Alignment.CenterHorizontally),
            fontFamily = secondFont
        )
        
    }
}
    
@Composable
fun AboutMe(modifier: Modifier){
    Column(modifier = modifier, verticalArrangement = Arrangement.Center) {
        Row(modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight()
            .padding(top = 13.dp)
            .align(Alignment.CenterHorizontally)
            .background(Color.White.copy(alpha = 0.5F)),
        ) {
            Text(
                text = stringResource(id = R.string.chi_sono_id),
                color = Color.White,
                fontWeight = FontWeight.Light,
                fontSize = 70.sp,
                modifier = Modifier
                    .align(alignment = Alignment.CenterVertically)
                    .padding(start = 28.dp),
                fontFamily = secondFont
            )
        }
        
    }
}

@Composable
fun HardSkillsDescription(modifier: Modifier) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "• Conoscenza base di Kotlin, Java, JetPack Compose, HTML, CSS",
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 8.dp)
                .align(Alignment.CenterHorizontally),
            fontFamily = secondFont
        )
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        Text(
            text = "• Microsoft Word, Power Point",
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 8.dp)
                .align(Alignment.CenterHorizontally),
            fontFamily = secondFont
        )
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        Text(
            text = "• Suite Adobe (Photoshop, InDesign, Bridge, Premiere)",
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 8.dp)
                .align(Alignment.CenterHorizontally),
            fontFamily = secondFont
        )
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        Text(
            text = "• Editing foto e video",
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 8.dp)
                .align(Alignment.CenterHorizontally),
            fontFamily = secondFont
        )
    }
}

@Composable
fun HardSkills(modifier: Modifier) {
    Column(modifier = modifier, verticalArrangement = Arrangement.Center) {
        Row(modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight()
            .align(Alignment.CenterHorizontally)
            .background(Color.White.copy(alpha = 0.5F)),
        ) {
            Text(
                text = "HARD SKILLS",
                color = Color.White,
                fontWeight = FontWeight.Light,
                fontSize = 70.sp,
                modifier = Modifier
                    .align(alignment = Alignment.CenterVertically)
                    .padding(start = 28.dp),
                fontFamily = secondFont
            )
        }

    }
}
