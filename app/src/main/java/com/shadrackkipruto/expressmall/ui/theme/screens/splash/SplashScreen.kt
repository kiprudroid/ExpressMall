package com.shadrackkipruto.expressmall.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.shadrackkipruto.expressmall.navigation.ROUT_HOME
import com.shadrackkipruto.expressmall.navigation.ROUT_LOGIN
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavHostController) {
 Column(
  modifier = Modifier.fillMaxSize(),
  verticalArrangement = Arrangement.Center,
  horizontalAlignment = Alignment.CenterHorizontally
 ){

  val coroutine = rememberCoroutineScope()
  coroutine.launch {
   delay(2000)
   navController.navigate(ROUT_HOME)
  }
Text(
 text = "Express Mall",
 fontSize = 30.sp,
 fontWeight = FontWeight.Medium,
 fontStyle = FontStyle.Italic,
 fontFamily = FontFamily.Monospace
 )
 }
}

@Preview
@Composable
fun SplashScreenPreview() {
 SplashScreen(rememberNavController())
}