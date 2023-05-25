package com.example.mycomposeintroduction


import android.graphics.Color.rgb
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Preview
@Composable
fun AboutMeScreen (
    modifier: Modifier = Modifier
) = Surface(color = (Color(rgb(110, 1, 82)))){
    Column (
        modifier = Modifier
            .fillMaxHeight()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            AboutMe(modifier = Modifier.fillMaxWidth())
        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            AboutMeDescription(modifier = Modifier.fillMaxWidth())
        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            SoftSkills()
        }
        Row (modifier = Modifier.fillMaxWidth()) {
            SoftSkillsDescription()
        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            HardSkills(modifier = Modifier)
        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            HardSkillsDescription()
        }

    }
}




@Composable
fun AboutMeDescription (modifier: Modifier = Modifier) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = stringResource(id = R.string.about_me_description),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(horizontal = 28.dp)
                .padding(top = 18.dp)
                .align(Alignment.CenterHorizontally),
            fontFamily = secondFont
        )
        
    }
}
    
@Composable
fun AboutMe(modifier: Modifier = Modifier){
    Column(modifier = modifier, verticalArrangement = Arrangement.Center) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp)
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
fun SoftSkillsDescription(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(horizontal = 28.dp)
            .padding(top = 18.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Text(
            text = stringResource(id = R.string.lavoro_di_squadra),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            fontFamily = secondFont
        )
        Text(
            text = stringResource(id = R.string.pensiero_analitico),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            fontFamily = secondFont
        )
        Text(
            text = stringResource(id = R.string.gestione_tempo),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            fontFamily = secondFont
        )
        Text(
            text = stringResource(id = R.string.motivazione),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            fontFamily = secondFont
        )
        Text(
            text = stringResource(id = R.string.organizzazione),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            fontFamily = secondFont
        )
        Text(
            text = stringResource(id = R.string.strumenti_informatici),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            fontFamily = secondFont
        )

    }
}

@Composable
fun SoftSkills(modifier: Modifier = Modifier) {
    Column(modifier = modifier, verticalArrangement = Arrangement.Center) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 18.dp)
                .align(Alignment.CenterHorizontally)
                .background(Color.White.copy(alpha = 0.5F)),
        ) {
            Text(
                text = stringResource(id = R.string.soft_skills_label),
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
fun HardSkillsDescription(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(horizontal = 28.dp)
            .padding(top = 18.dp, bottom = 20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Text(
            text = stringResource(id = R.string.conoscenza_informatica),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            fontFamily = secondFont
        )
        Text(
            text = stringResource(id = R.string.conoscenza_lingua),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            fontFamily = secondFont
        )
        Text(
            text = stringResource(id = R.string.conoscenza_microsoft),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            fontFamily = secondFont
        )
        Text(
            text = stringResource(id = R.string.conoscenza_suite_adobe),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            fontFamily = secondFont
        )
        Text(
            text = stringResource(id = R.string.conoscenza_fotogtafica),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            fontFamily = secondFont
        )

    }
}


@Composable
fun HardSkills(modifier: Modifier) {
    Column(modifier = modifier, verticalArrangement = Arrangement.Center) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 18.dp)
                .align(Alignment.CenterHorizontally)
                .background(Color.White.copy(alpha = 0.5F)),
        ) {
            Text(
                text = stringResource(id = R.string.hard_skills_label),
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

