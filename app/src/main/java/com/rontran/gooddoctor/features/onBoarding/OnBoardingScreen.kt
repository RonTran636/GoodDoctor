package com.rontran.gooddoctor.features.onBoarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.rontran.gooddoctor.R
import com.rontran.gooddoctor.ui.navigation.Screens
import com.rontran.gooddoctor.ui.theme.GoodDoctorTheme
import com.rontran.gooddoctor.ui.theme.backgroundWhite


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OnBoardingScreen(navCtrl: NavHostController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = "Welcome", fontSize = 24.sp, fontWeight = FontWeight.W700) },
                actions = {
                    TextButton(onClick = { navCtrl.navigate(Screens.login) }) {
                        Text(text = "Skip", color = Color.Red)
                    }
                },
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .padding(it)
                    .fillMaxSize()
                    .background(backgroundWhite),
                verticalArrangement = Arrangement.Top,
//                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.on_boarding_image),
                    contentDescription = null,
                    modifier = Modifier.padding(19.dp)
                )

            }
        }
    )
}

@Preview
@Composable
fun OnBoardingScreenPreview() {
    GoodDoctorTheme {
        OnBoardingScreen(navCtrl = rememberNavController())
    }

}