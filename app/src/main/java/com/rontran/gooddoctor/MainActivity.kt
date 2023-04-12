package com.rontran.gooddoctor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.compose.rememberNavController
import com.rontran.gooddoctor.ui.navigation.SetupNavController
import com.rontran.gooddoctor.ui.theme.GoodDoctorTheme

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GoodDoctorTheme() {
                Surface(color = MaterialTheme.colorScheme.background) {
                    SetupNavController(navCtrl = rememberNavController())
                }
            }
        }
    }
}