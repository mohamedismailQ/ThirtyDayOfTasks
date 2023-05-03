package com.example.thirtydayoftasks.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.thirtydayoftasks.R


val Josefinsans = FontFamily(
    Font(R.font.josefinsans_bold, FontWeight.Bold),
    Font(R.font.josefinsans_light, FontWeight.Light),
    Font(R.font.josefinsans_regular, FontWeight.Normal)
)
// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        fontFamily = Josefinsans,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp
    ),
    h2 = TextStyle(
        fontFamily = Josefinsans,
        fontWeight = FontWeight.Light,
        fontSize = 20.sp
    ),
    body2 = TextStyle(
        fontFamily = Josefinsans,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp
    )
)