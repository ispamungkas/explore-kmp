package com.maspam.myapplication

import androidx.compose.ui.graphics.ImageBitmap

expect class ImageResources {
    fun getImageResources() : ImageBitmap
}