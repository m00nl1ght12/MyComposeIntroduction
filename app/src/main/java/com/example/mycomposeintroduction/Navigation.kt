package com.example.mycomposeintroduction

import android.graphics.Color.rgb
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun Navigation(
    modifier : Modifier,
    navController: NavHostController
) {
    NavHost(modifier = modifier.background(color = Color(rgb(110, 1, 82))), navController = navController, startDestination = "home") {
        composable("home") {
            ComposeIntroduction()
        }
        composable("profile") {
            AboutMeScreen()
        }
        composable("job") {
            WorkExperienceScreen()
        }
    }
}

@Composable
fun BottomNavigationBar(
    items: List<BottomNavItem>,
    navController: NavController,
    modifier: Modifier = Modifier,
    onItemClick: (BottomNavItem) -> Unit
)  = Surface(color = Color(rgb(110, 1, 82)))
{
    val backStackEntry = navController.currentBackStackEntryAsState()
    Column {
       //Divider(Modifier.fillMaxWidth().requiredHeight(2.dp), color = Color.White.copy(alpha = .2f))
        BottomNavigation(
            modifier = modifier,
            backgroundColor = Color(rgb(77, 1, 82)).copy(alpha = .5f),
            elevation = 1.dp
        ) {
            items.forEach { item ->
                val selected = item.route == backStackEntry.value?.destination?.route
                BottomNavigationItem(
                    selected = item.route == navController.currentDestination?.route,
                    onClick = { onItemClick(item) },
                    selectedContentColor = Color.White,
                    unselectedContentColor = Color(rgb(215, 197, 233)),
                    icon = {
                        Column(horizontalAlignment = CenterHorizontally) {
                            Icon(imageVector = item.icon, contentDescription = item.name)
                        }
                    },
                    label = { Text(text = item.name, fontSize = 9.sp, textAlign = TextAlign.Center)}
                )
            }
        }
    }

    
}