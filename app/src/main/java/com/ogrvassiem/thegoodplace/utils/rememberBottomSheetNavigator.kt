package com.ogrvassiem.thegoodplace.utils

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.google.accompanist.navigation.material.BottomSheetNavigator
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi

@ExperimentalMaterialNavigationApi
@Composable
fun rememberBottomSheetNavigator(
    sheetState: ModalBottomSheetState
): BottomSheetNavigator {
    return remember(sheetState) {
        BottomSheetNavigator(sheetState = sheetState)
    }
}