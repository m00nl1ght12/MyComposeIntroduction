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
