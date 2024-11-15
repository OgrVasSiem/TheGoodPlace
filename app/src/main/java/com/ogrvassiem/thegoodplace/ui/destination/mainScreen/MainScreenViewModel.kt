package com.ogrvassiem.thegoodplace.ui.destination.mainScreen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ogrvassiem.thegoodplace.core.models.ImageItem
import com.ogrvassiem.thegoodplace.core.remote.NekoApiService
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlin.math.log

@HiltViewModel
class MainScreenViewModel @Inject constructor(
    private val nekoApiService: NekoApiService
) : ViewModel() {

    private val _images = MutableStateFlow<List<ImageItem>>(emptyList())
    val images: StateFlow<List<ImageItem>> = _images.asStateFlow()

    private val _isLoading = MutableStateFlow(true)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()

    private val _errorMessage = MutableStateFlow<String?>(null)
    val errorMessage: StateFlow<String?> = _errorMessage.asStateFlow()

    init {
        fetchImages()
    }

    private fun fetchImages() {
        viewModelScope.launch {
            _isLoading.value = true
            _errorMessage.value = null
            try {
                val response = nekoApiService.searchImages(
                    rating = listOf("safe"),
                    limit = 5
                )
                _images.value = response.items
                Log.d("MainScreenViewModel", "Получено изображений: ${images.value.size}")
            } catch (e: Exception) {
                e.printStackTrace()
                _errorMessage.value = "Не удалось загрузить изображения: ${e.localizedMessage}"
            } finally {
                _isLoading.value = false
            }
        }
    }
}
