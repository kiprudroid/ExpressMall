package com.shadrackkipruto.expressmall.ui.theme.screens.accounts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.shadrackkipruto.expressmall.navigation.BottomAppBarExample
import com.shadrackkipruto.expressmall.navigation.ExpressTopAppBar
import com.shadrackkipruto.expressmall.navigation.ROUT_HOME
import com.shadrackkipruto.expressmall.ui.theme.mainBlue

@Composable
fun AccountScreen(navHostController: NavHostController){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        ExpressTopAppBar(title = " Your Account", ROUT_HOME, navHostController)
        Column(
            modifier = Modifier.weight(1f)
        ) {

            //Main Screen
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {

            }
        }

        BottomAppBarExample(tint4 = Color.Black, navHostController = navHostController)
    }
}
@Preview
@Composable
fun AccountPreview(){
    AccountScreen(rememberNavController())
}