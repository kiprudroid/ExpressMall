package com.shadrackkipruto.expressmall.ui.theme.screens.login


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.shadrackkipruto.expressmall.R
import com.shadrackkipruto.expressmall.auth.AuthViewModel

import com.shadrackkipruto.expressmall.navigation.ROUT_SIGNUP

@Composable
fun LoginScreen(navHostController: NavHostController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize()
    ){
        Row(
            modifier = Modifier.fillMaxWidth()
                .height(70.dp)
        ) {

        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription ="logo" ,
                modifier = Modifier
                    .size(200.dp),
                alignment = Alignment.BottomCenter

            )
        }
        //Text field
        TextField(
            value = email,
            onValueChange = {email = it},
            placeholder = {Text(text="Enter Email Address")},
            leadingIcon = { Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "person")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )
        Spacer(modifier = Modifier.height(10.dp))

        //End Text field
        //Text field
        TextField(
            value = password,
            onValueChange = {password = it},
            placeholder = {Text(text="Enter Password")},
            leadingIcon = { Icon(
                imageVector = Icons.Default.Lock,
                contentDescription = "person")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

        )
        Spacer(modifier = Modifier.height(10.dp))

        //End Text field

        val mContext = LocalContext.current
        val authViewModel = AuthViewModel(navHostController, mContext)
//begin button
        OutlinedButton(onClick = {
                                 authViewModel.login(mContext, email, password)
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Blue)
        ) {
            Text(
                text="Login",
                color = Color.Blue,
                fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(10.dp))
        //End of outlined Button


        Text(
            text = "Do not have an account ? signup .",
            color = Color.Blue,
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .clickable {
                    navHostController.navigate(ROUT_SIGNUP)
                })


    }
       
    }



@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())
}