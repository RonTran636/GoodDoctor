package com.rontran.gooddoctor.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.rontran.gooddoctor.features.login.LoginScreen
import com.rontran.gooddoctor.features.main.MainScreen
import com.rontran.gooddoctor.features.onBoarding.OnBoardingScreen
import com.rontran.gooddoctor.features.splash.SplashScreen

@Composable
fun SetupNavController(navCtrl: NavHostController) {
    NavHost(navController = navCtrl, startDestination = Screens.splash) {
        composable(Screens.splash) { SplashScreen(navCtrl = navCtrl) }
        composable(Screens.onBoarding) { OnBoardingScreen(navCtrl = navCtrl)}
        composable(Screens.login) { LoginScreen() }
        composable(Screens.main) { MainScreen() }
    }
}

object Screens {
    const val splash = "splash"
    const val login = "login"
    const val main = "main"
    const val onBoarding = "onBoarding"

}