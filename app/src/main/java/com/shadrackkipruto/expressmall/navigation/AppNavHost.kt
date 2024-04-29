package com.shadrackkipruto.expressmall.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavHostController
import com.shadrackkipruto.expressmall.ui.theme.screens.accounts.AccountScreen
import com.shadrackkipruto.expressmall.ui.theme.screens.category.CategoryScreen
import com.shadrackkipruto.expressmall.ui.theme.screens.home.HomeScreen
import com.shadrackkipruto.expressmall.ui.theme.screens.login.LoginScreen
import com.shadrackkipruto.expressmall.ui.theme.screens.shops.ShopScreen
import com.shadrackkipruto.expressmall.ui.theme.screens.signup.SignupScreen
import com.shadrackkipruto.expressmall.ui.theme.screens.splash.SplashScreen


@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController:NavHostController = rememberNavController(), startDestination:String = ROUT_SPLASH) {
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUT_SIGNUP) {
            SignupScreen(navController)
        }
        composable(ROUT_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUT_SHOPS) {
            ShopScreen(navController)
        }
        composable(ROUT_CATEGORY) {
            CategoryScreen(navController)
        }
        composable(ROUT_ACCOUNT) {
            AccountScreen(navController)
        }

    }
}
