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
fun WorkExperienceScreen(
    modifier: Modifier = Modifier
) = Surface(color = (Color(rgb(110, 1, 82)))) {
    Column(modifier = Modifier
        .fillMaxHeight()
        .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Row(modifier = Modifier.fillMaxWidth()) {
            WorkExperience()
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            WorkExperienceDescription()
        }
        Row(modifier = Modifier.fillMaxWidth()){
            EducationAndTraining()
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            EducationAndTrainingDescription()
        }
    }
}

@Composable
fun EducationAndTraining(modifier: Modifier = Modifier) {
    Column(modifier = modifier, verticalArrangement = Arrangement.Center) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 18.dp)
                .align(Alignment.CenterHorizontally)
                .background(Color.White.copy(alpha = 0.5F)),
        ) {
            Text(
                text = stringResource(id = R.string.education_and_training_label),
                color = Color.White,
                fontWeight = FontWeight.Light,
                fontSize = 70.sp,
                modifier = Modifier
                    .align(alignment = Alignment.CenterVertically)
                    .padding(start = 20.dp),
                fontFamily = secondFont
            )
        }

    }
}

@Composable
fun EducationAndTrainingDescription(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.padding(bottom = 80.dp)){
        Text(
            text = stringResource(id = R.string.education_year),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(horizontal = 28.dp)
                .padding(top = 18.dp),
            fontFamily = secondFont
        )
        Text(
            text = stringResource(id = R.string.education_type),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(horizontal = 28.dp)
                .padding(top = 5.dp),
            fontFamily = secondFont
        )
        Text(
            text = stringResource(id = R.string.school_name),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(horizontal = 28.dp)
                .padding(top = 5.dp),
            fontFamily = secondFont
        )
    }
}

@Composable
fun WorkExperienceDescription(modifier: Modifier = Modifier) {
    Column(modifier = Modifier, verticalArrangement = Arrangement.spacedBy(10.dp)) {
        Box(modifier = Modifier) {
            ExperienceDescriptionFirstBlock()
        }
        Box(modifier = Modifier) {
            ExperienceDescriptionSecondBlock()
        }
        Box(modifier = Modifier) {
            ExperienceDescriptionThirdBlock()
        }
    }
}


@Composable
fun ExperienceDescriptionThirdBlock() {
    Column(modifier = Modifier) {
        Text(text = stringResource(id = R.string.corso_web_design),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(horizontal = 28.dp)
                .padding(top = 18.dp),
            fontFamily = secondFont)
        Text(
            text = stringResource(id = R.string.abilità_web_design),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(horizontal = 28.dp)
                .padding(top = 8.dp),
            fontFamily = secondFont
        )
        Text(
            text = stringResource(id = R.string.sviluppo_sito_web),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(horizontal = 28.dp)
                .padding(top = 5.dp),
            fontFamily = secondFont
        )
        Text(
            text = stringResource(id = R.string.linguaggi_corso_web),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(horizontal = 28.dp)
                .padding(top = 5.dp),
            fontFamily = secondFont
        )
    }
}

@Composable
fun ExperienceDescriptionSecondBlock() {
    Column(modifier = Modifier) {
        Text(
            text = stringResource(id = R.string.compose_camp),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(horizontal = 28.dp)
                .padding(top = 18.dp),
            fontFamily = secondFont
        )
        Text(
            text = stringResource(id = R.string.abilità_compose_camp),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(horizontal = 28.dp)
                .padding(top = 8.dp),
            fontFamily = secondFont
        )
        Text(
            text = stringResource(id = R.string.kotlin_basics),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(horizontal = 28.dp)
                .padding(top = 5.dp),
            fontFamily = secondFont
        )
        Text(
            text = stringResource(id = R.string.jetpack_compose),
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(horizontal = 28.dp)
                .padding(top = 5.dp),
            fontFamily = secondFont
        )
    }
}

@Composable
fun ExperienceDescriptionFirstBlock(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier){
            Text(
                text = stringResource(id = R.string.puglia_women_code),
                color = Color.White,
                fontWeight = FontWeight.Light,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(horizontal = 28.dp)
                    .padding(top = 18.dp),
                fontFamily = secondFont
            )
            Text(
                text = stringResource(id = R.string.abilità_puglia_women_code),
                color = Color.White,
                fontWeight = FontWeight.Light,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(horizontal = 28.dp)
                    .padding(top = 8.dp),
                fontFamily = secondFont
            )
            Text(
                text = stringResource(id = R.string.progettazione_sito_web),
                color = Color.White,
                fontWeight = FontWeight.Light,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(horizontal = 28.dp)
                    .padding(top = 5.dp),
                fontFamily = secondFont
            )
            Text(
                text = stringResource(id = R.string.linguaggi_web),
                color = Color.White,
                fontWeight = FontWeight.Light,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(horizontal = 28.dp)
                    .padding(top = 5.dp),
                fontFamily = secondFont
            )
            Text(
                text = stringResource(id = R.string.lavoro_team),
                color = Color.White,
                fontWeight = FontWeight.Light,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(horizontal = 28.dp)
                    .padding(top = 5.dp),
                fontFamily = secondFont
            )
        }

    }


@Composable
fun WorkExperience(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp)
                .align(Alignment.CenterHorizontally)
                .background(Color.White.copy(alpha = 0.5F)),
        ) {
            Text(
                text = stringResource(id = R.string.work_experience_label),
                color = Color.White,
                fontWeight = FontWeight.Light,
                fontSize = 60.sp,
                modifier = Modifier
                    .align(alignment = Alignment.CenterVertically)
                    .padding(start = 28.dp),
                fontFamily = secondFont
            )
        }

    }
}
