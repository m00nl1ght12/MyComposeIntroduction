package com.example.mycomposeintroduction

import android.graphics.Color.rgb
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycomposeintroduction.ui.theme.MyComposeIntroductionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeIntroductionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(rgb(110, 1, 82))
                ) {
                    Column(modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize()) {
                        ComposeIntroduction(modifier = Modifier.fillMaxSize())
                        
                    }
                }
            }
        }
    }
}

@Composable
fun ComposeIntroduction(
    modifier: Modifier = Modifier
) = Surface(color = Color(rgb(110, 1, 82))){
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Header(modifier = Modifier
            .weight(1f)
            .wrapContentSize())
        Footer(modifier = Modifier.wrapContentSize())

    }
}


@Composable
fun Footer(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(bottom = 30.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Divider(modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(color = Color.White))
        FooterRow(text = "m00nl1ght12", image = R.drawable.github)
        Divider(modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(color = Color.White))
        FooterRow(text = "Angelica Magnifico", image = R.drawable.linkedin, )
        Divider(modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(color = Color.White))
        FooterRow(text = "angelica.magnifico.am96@gmail.com", image = R.drawable.email_symbol_png_transparent)

        
    }
}

@Composable
fun FooterRow(
    text : String,
    image : Int,

) {
    Row(verticalAlignment = Alignment.Bottom) {
        Image(modifier = Modifier
            .size(30.dp)
            .padding(end = 3.dp)
            .align(Alignment.CenterVertically), painter = painterResource(id = image) , contentDescription = null, colorFilter = ColorFilter.tint(Color(rgb(215, 197, 233))))
        Text(text = text, color = Color.White, fontWeight = FontWeight.Light, fontSize = 18.sp, modifier = Modifier.padding(8.dp), fontFamily = font)
        
    }
}

val appFontFamily = FontFamily(
        Font(
            resId = R.font.dazzlingdivas,
            weight = FontWeight.Light,
            style = FontStyle.Normal
        )
    )

val font = FontFamily(
    Font(
        resId = R.font.littlesunshine,
        weight = FontWeight.ExtraBold,
        style = FontStyle.Normal
    )
)



@Composable
fun Header(
    modifier: Modifier = Modifier
) = Column(modifier = modifier.padding(top= 130.dp, bottom = 150.dp)) {
    Image(painter = painterResource(id = R.drawable.livello_0), contentDescription = null, modifier = Modifier
        .size(150.dp)
        .padding(5.dp)
        .align(Alignment.CenterHorizontally))
    Text(text = "Angelica Magnifico", color = Color.White, modifier = modifier.align(Alignment.CenterHorizontally).padding(top = 15.dp), fontSize = 30.sp, fontFamily = appFontFamily)
    Text(text = "Aspiring Junior Android Developer", color = Color(rgb(215, 197, 233)), modifier = modifier
        .align(Alignment.CenterHorizontally),
    fontFamily = font, fontSize = 18.sp)


}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() = Column(modifier = Modifier.fillMaxSize()){
    ComposeIntroduction(modifier = Modifier)
    }
