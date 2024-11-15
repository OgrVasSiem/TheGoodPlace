package com.ogrvassiem.thegoodplace.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

data class TextStyles(
    val title: TextStyle,
) {
    constructor() : this(
        title = TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight(500),
            lineHeight = 22.sp,
            letterSpacing = (-0.41).sp
        ),
    )
}

val LocalTextStyles = staticCompositionLocalOf { TextStyles() }