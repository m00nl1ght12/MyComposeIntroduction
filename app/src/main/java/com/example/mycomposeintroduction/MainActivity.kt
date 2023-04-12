package com.example.mycomposeintroduction

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.Configuration
import android.graphics.Color.rgb
import android.net.Uri
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
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
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
) = Surface(color = Color(rgb(110, 1, 82))) {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Row(modifier = Modifier.fillMaxSize()) {
                Box(
                    modifier = Modifier
                        .weight(.5f)
                        .fillMaxSize()
                        .background(color = Color(rgb(110, 1, 82))), Alignment.Center
                ) {
                    Header(modifier = Modifier.fillMaxSize())
                }
                Box(
                    modifier = Modifier
                        .weight(.5f)
                        .fillMaxSize()
                        .background(color = Color(rgb(110, 1, 82))), Alignment.Center
                ) {
                    Footer(modifier = Modifier.padding(top = 40.dp))
                }
            }
        }
        else -> {
            Column(modifier = Modifier) {
                Box(
                    modifier = Modifier
                        .weight(.5f)
                        .fillMaxSize()
                        .padding(top = 120.dp)
                        .background(color = Color((rgb(110, 1, 82)))), Alignment.Center
                ) {
                    Header(modifier = Modifier.fillMaxSize())
                }
                Box(
                    modifier = Modifier
                        .weight(.5f)
                        .fillMaxSize()
                        .background(color = Color((rgb(110, 1, 82)))), Alignment.BottomCenter
                ) {
                    Footer(modifier = Modifier.padding(bottom = 10.dp))
                }
            }
        }
    }
}

@Composable
fun Footer(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(bottom = 30.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Divider(modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(color = Color.White))
        FooterRow(text = R.string.github_id, image = R.drawable.github,)
        Divider(modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(color = Color.White))
        FooterRow(text = R.string.linkedin_id, image = R.drawable.linkedin, )
        Divider(modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(color = Color.White))
        FooterRow(text = R.string.e_mail, image = R.drawable.email_symbol_png_transparent)
        Divider(modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(color = Color.White))

        
    }
}
/*
@Composable
fun openWebPage(url: String) {
    val webpage: Uri = Uri.parse(url)
    val intent = Intent(Intent.ACTION_VIEW, webpage)
    startActivity(intent)
} */

@Composable
fun FooterRow(
    text : Int,
    image : Int,
   // onTextClick : () -> Unit

) {
    Row(verticalAlignment = Alignment.Bottom) {
        Image(modifier = Modifier
            .size(30.dp)
            .padding(end = 3.dp)
            .align(Alignment.CenterVertically), painter = painterResource(id = image) , contentDescription = null, colorFilter = ColorFilter.tint(Color(rgb(215, 197, 233))))
        Text(stringResource(id = text), color = Color.White, fontWeight = FontWeight.Light, fontSize = 18.sp, modifier = Modifier.padding(8.dp), fontFamily = secondFont)
        
    }
}

val firstFont = FontFamily(
        Font(
            resId = R.font.dazzlingdivas,
            weight = FontWeight.Light,
            style = FontStyle.Normal
        )
    )

val secondFont = FontFamily(
    Font(
        resId = R.font.littlesunshine,
        weight = FontWeight.ExtraBold,
        style = FontStyle.Normal
    )
)



@Composable
fun Header(
    modifier: Modifier = Modifier
) = Column(modifier = modifier, Arrangement.Center) {
    Image(painter = painterResource(id = R.drawable.livello_0), contentDescription = null, modifier = Modifier
        .size(150.dp)
        .align(Alignment.CenterHorizontally))
    Text(text = "Angelica Magnifico", color = Color.White, modifier = Modifier
        .align(Alignment.CenterHorizontally)
        .padding(top = 12.dp), fontSize = 30.sp, fontFamily = firstFont)
    Text(text = "Aspiring Junior Android Developer", color = Color(rgb(215, 197, 233)), modifier = Modifier
        .align(Alignment.CenterHorizontally)
        .padding(top = 3.dp),
    fontFamily = secondFont, fontSize = 18.sp)
}


//@SuppressLint("SwitchIntDef")
@Preview
@Preview()
@Composable
fun DefaultPreview()
    = Surface(color = Color(rgb(110, 1, 82))) {
        val configuration = LocalConfiguration.current
        when (configuration.orientation) {
            Configuration.ORIENTATION_LANDSCAPE -> {
                Row(modifier = Modifier.fillMaxSize()) {
                    Box(
                        modifier = Modifier
                            .weight(.5f)
                            .fillMaxSize()
                            .background(color = Color(rgb(110, 1, 82))), Alignment.Center
                    ) {
                        Header(modifier = Modifier.fillMaxSize())
                    }
                    Box(
                        modifier = Modifier
                            .weight(.5f)
                            .fillMaxSize()
                            .background(color = Color(rgb(110, 1, 82))), Alignment.Center
                    ) {
                        Footer(modifier = Modifier.padding(top = 40.dp))
                    }
                }
            }
            else -> {
                Column(modifier = Modifier) {
                    Box(
                        modifier = Modifier
                            .weight(.5f)
                            .fillMaxSize()
                            .padding(top = 120.dp)
                            .background(color = Color((rgb(110, 1, 82)))), Alignment.Center
                    ) {
                        Header(modifier = Modifier.fillMaxSize())
                    }
                    Box(
                        modifier = Modifier
                            .weight(.5f)
                            .fillMaxSize()
                            .background(color = Color((rgb(110, 1, 82)))), Alignment.BottomCenter
                    ) {
                        Footer(modifier = Modifier.padding(bottom = 10.dp))
                    }
                }
            }
        }
    }