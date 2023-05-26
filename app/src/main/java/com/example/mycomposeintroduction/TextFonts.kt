package com.example.mycomposeintroduction

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight

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