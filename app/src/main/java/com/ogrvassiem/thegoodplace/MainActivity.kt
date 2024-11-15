package com.ogrvassiem.thegoodplace

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import com.ogrvassiem.thegoodplace.ui.ApplicationRootUI
import dagger.hilt.android.AndroidEntryPoint
import com.ogrvassiem.thegoodplace.ui.theme.Theme


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(Color.TRANSPARENT),
            navigationBarStyle = SystemBarStyle.dark(Color.TRANSPARENT)
        )

        super.onCreate(savedInstanceState)

        setContent {
            CompositionLocalProvider(LocalActivity provides this@MainActivity) {
                Theme {
                    ApplicationRootUI()
                }
            }
        }
    }
}


val LocalActivity = staticCompositionLocalOf<Activity> {
    noLocalProvidedFor("LocalActivity")
}

private fun noLocalProvidedFor(name: String): Nothing {
    error("CompositionLocal $name not present")
}
