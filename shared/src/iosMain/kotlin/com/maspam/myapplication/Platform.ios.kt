package com.maspam.myapplication


class IOSPlatform: Platform {
    override val name: String = "Ini ios bos senggol dong"
}

actual fun getPlatform(): Platform = IOSPlatform()