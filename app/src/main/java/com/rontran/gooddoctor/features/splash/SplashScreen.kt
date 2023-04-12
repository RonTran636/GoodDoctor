package com.rontran.gooddoctor.features.splash

import android.os.Handler
import android.os.Looper
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.rontran.gooddoctor.R
import com.rontran.gooddoctor.ui.navigation.Screens

@Composable
fun SplashScreen(navCtrl: NavHostController) {
    Image(
        painter = painterResource(id = R.drawable.splash_screen),
        contentDescription = null,
        contentScale = ContentScale.FillWidth,
        modifier = Modifier.fillMaxSize()
    )
    Handler(Looper.getMainLooper()).postDelayed({
        navCtrl.navigate(Screens.login)
    }, 1500)
}