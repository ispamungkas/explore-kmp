package com.maspam.myapplication

import android.content.Context
import android.graphics.drawable.BitmapDrawable
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap

actual class ImageResources(private val context: Context) {
    actual fun getImageResources() : ImageBitmap {
        val drawable = context.resources.getDrawable(R.drawable.ds, null)
        val bitmap = (drawable as BitmapDrawable).bitmap
        return bitmap.asImageBitmap()
    }
}