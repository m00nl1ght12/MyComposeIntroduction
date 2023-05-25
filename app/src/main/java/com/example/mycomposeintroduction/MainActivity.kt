package com.example.mycomposeintroduction

import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.graphics.Color.rgb
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
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
                    val navController = rememberNavController()
                    Scaffold(
                        bottomBar = {
                            BottomNavigationBar(
                                items = listOf(
                                    BottomNavItem(
                                        name = "Home",
                                        route = "home",
                                        icon = Icons.Default.Home
                                    ),
                                    BottomNavItem(
                                        name = "Profile",
                                        route = "profile",
                                        icon = Icons.Default.AccountCircle
                                    ),
                                    BottomNavItem(
                                        name = "Job",
                                        route = "job",
                                        icon = Icons.Default.Work
                                    )
                                ),
                                navController = navController,
                                onItemClick = {
                                    navController.navigate(it.route)
                                }
                            )
                        }
                    ) {
                        Navigation(modifier = Modifier.padding(it), navController = navController)
                        it
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
            Row(modifier = modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
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
                    Column {
                        Footer(modifier = Modifier.padding(top = 30.dp))
                        Divider(modifier = Modifier
                            .fillMaxWidth()
                            .height(1.dp)
                            .background(color = Color.White))
                    }

                }
            }
        }
        else -> {
            Column(modifier = modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .wrapContentSize()
                        .background(color = Color((rgb(110, 1, 82)))), Alignment.Center
                ) {
                    Header(modifier = Modifier)
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
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
    val localContext = LocalContext.current
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Divider(modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(color = Color.White))
        FooterRow(text = R.string.github_id, image = R.drawable.github, Modifier.clickable { openWebPage(localContext, url = "https://github.com/m00nl1ght12")  } )
        Divider(modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(color = Color.White))
        FooterRow(
            text = R.string.linkedin_id,
            image = R.drawable.linkedin, Modifier.clickable { openWebPage(localContext, url = "https://www.linkedin.com/in/angelicamagnifico/") } )
        Divider(modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(color = Color.White))
        FooterRow(
            text = R.string.e_mail,
            image = R.drawable.email_symbol_png_transparent, Modifier.clickable { openWebPage(localContext, url = "mailto:angelica_magnifico_am_96@gmail.com") }
        )


        
    }
}



@Composable
fun FooterRow(
    text: Int,
    image: Int,
    modifier : Modifier

    ) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        Image(modifier = Modifier
            .size(30.dp)
            .padding(end = 3.dp)
            .align(Alignment.CenterVertically), painter = painterResource(id = image) , contentDescription = null, colorFilter = ColorFilter.tint(Color(rgb(215, 197, 233))))
        Text(stringResource(id = text), color = Color.White, fontWeight = FontWeight.Light, fontSize = 18.sp, modifier = Modifier
            .padding(8.dp)
            .align(Alignment.CenterVertically),fontFamily = secondFont)
        
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

fun openWebPage(localContext: Context, url: String) {
    val webpage: Uri = Uri.parse(url)
    val intent = Intent(Intent.ACTION_VIEW, webpage)
    localContext.startActivity(intent)
}


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
                        Footer(modifier = Modifier.padding(top = 30.dp))
                    }
                }
            }
            else -> {
                Column(modifier = Modifier) {
                    Box(
                        modifier = Modifier
                            .weight(.5f)
                            .fillMaxSize()
                            .padding(top = 100.dp)
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
