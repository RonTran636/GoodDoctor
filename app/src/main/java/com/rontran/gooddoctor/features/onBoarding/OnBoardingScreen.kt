package com.rontran.gooddoctor.features.onBoarding

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.rontran.gooddoctor.R
import com.rontran.gooddoctor.ui.navigation.Screens
import com.rontran.gooddoctor.ui.theme.*


@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun OnBoardingScreen(navCtrl: NavHostController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Welcome",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.W700,
                        color = primaryColor,
                    )
                },
                actions = {
                    TextButton(onClick = { navCtrl.navigate(Screens.login) }) {
                        Text(text = "Skip", color = Color.Red, fontSize = 16.sp)
                    }
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = backgroundWhite
                )
            )
        },
        content = {
            HorizontalPager(pageCount = 3) { page ->
                Column(
                    modifier = Modifier
                        .padding(it)
                        .fillMaxSize()
                        .background(backgroundWhite),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.on_boarding_image),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(1F)
                            .padding(16.dp)
                    )
                    Spacer(modifier = Modifier.height(40.dp))
                    Text(
                        text = "Protect your family member with GoodDoctor",
                        modifier = Modifier.padding(horizontal = 24.dp),
                        color = primaryColor,
                        textAlign = TextAlign.Center,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.W700,
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
                        modifier = Modifier.padding(horizontal = 24.dp),
                        color = greyText,
                        textAlign = TextAlign.Center,
                        fontSize = 16.sp,
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Box(
                            modifier = Modifier
                                .clip(CircleShape)
                                .background(primaryColor)
                                .width(48.dp)
                                .aspectRatio(1F)
                        ) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = null,
                                tint = whiteColor,
                            )
                        }

                        Box(
                            modifier = Modifier
                                .clip(CircleShape)
                                .background(primaryColor)
                                .width(48.dp)
                                .aspectRatio(1F)
                        ) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = null,
                                tint = whiteColor,
                            )
                        }
                    }
                }
            }
        }
    )
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun OnBoardingScreenPreview() {
    GoodDoctorTheme {
        OnBoardingScreen(navCtrl = rememberNavController())
    }
}