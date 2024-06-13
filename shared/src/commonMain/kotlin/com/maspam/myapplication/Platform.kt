package com.maspam.myapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform