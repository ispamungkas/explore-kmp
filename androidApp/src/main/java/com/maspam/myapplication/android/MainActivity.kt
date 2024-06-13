package com.maspam.myapplication.android

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.maspam.myapplication.Greeting
import com.maspam.myapplication.ImageResources

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingView(Greeting().greet(), ImageResources(this))
                }
            }
        }
    }
}

@Composable
fun GreetingView(text: String, imageResources: ImageResources) {
    val bitmap = imageResources.getImageResources()

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {

        Image(
            bitmap = bitmap, contentDescription = "Gambar Bukti",
            modifier = Modifier
                .width(100.dp)
                .height(300.dp)
                .clip(RoundedCornerShape(12.dp))
                .blur(
                    radiusX = 6.dp, radiusY = 6.dp,
                    edgeTreatment = BlurredEdgeTreatment(
                        RoundedCornerShape(12.dp),
                    ),
                ),
            contentScale = ContentScale.Crop
        )
        Text(text = text)
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView("Hello, Android!", ImageResources(Activity().applicationContext))
    }
}
