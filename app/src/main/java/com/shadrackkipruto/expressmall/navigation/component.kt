package com.shadrackkipruto.expressmall.navigation

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultShadowColor
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.shadrackkipruto.expressmall.R
import com.shadrackkipruto.expressmall.ui.theme.lightGrey
import com.shadrackkipruto.expressmall.ui.theme.mainBlue

@Composable
fun BottomAppBarExample(tint1:Color = mainBlue,tint2:Color = mainBlue,tint3:Color = mainBlue,tint4:Color = mainBlue,navHostController: NavHostController) {


            BottomAppBar(
                actions = {
                    IconButton(onClick = {
                        navHostController.navigate(ROUT_HOME)
                    },
                        
                        ) {
                        Icon(
                            painterResource(id = R.drawable.baseline_home_24),
                            contentDescription = "Localized description",
                           tint = tint1
                        )


                    }

                    Spacer(modifier = Modifier.weight(1f))
                    IconButton(onClick = {
                        navHostController.navigate(ROUT_SHOPS)

                    }) {
                        Icon(
                            painterResource(id = R.drawable.shops),
                            contentDescription = "Localized description",
                            tint = tint2

                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))

                    IconButton(onClick = {
                        navHostController.navigate(ROUT_CATEGORY)

                    }) {
                        Icon(
                            painterResource(id = R.drawable.baseline_category_24),
                            contentDescription = "Localized description",
                            tint = tint3
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))

                    IconButton(onClick = {
                        navHostController.navigate(ROUT_ACCOUNT)

                    }) {
                        Icon(
                            painterResource(id = R.drawable.baseline_account_circle_24),
                            contentDescription = "Localized description",
                            tint = tint4
                        )
                    }
                }
                
            )

}

@Composable
fun ProductCard(productName :String,productDescription:String,productPrice :Int ,productShop :String,productImage:Int){
//    var mContext = LocalContext.current
    Row {


        //Column 1
        Column(
            modifier= Modifier
                .width(160.dp)
                .border(2.dp, mainBlue)

        ) {
            Card(
                modifier = Modifier
                    .height(100.dp)
                    .width(160.dp)
                    .shadow(
                        4.dp, RectangleShape, true, DefaultShadowColor,
                        DefaultShadowColor
                    )

            ) {

                Box(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentAlignment = Alignment.TopEnd,


                    ) {
                    Image(
                        painter = painterResource(id = productImage),
                        contentDescription = "first",
                        contentScale = ContentScale.FillBounds
                    )

                }
            }


                    Text(
                        text = productName,
                        fontSize = 20.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold
                    )


                    Text(
                        text = productDescription,
                        fontSize = 15.sp,
                        fontFamily = FontFamily.SansSerif,

                        )
                    Text(
                        text = productShop,
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif

                    )
                    Text(
                        text = "Ksh. $productPrice",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.SansSerif,
                        color = Color.Blue
                    )

                }
            }

        //End Of Column 1




    }

@Composable
fun ExclusiveProductCard(productName :String,productDescription:String,productPrice :Int ,productShop :String,productImage:Int){




            Card(
                modifier = Modifier
                    .fillMaxWidth()
//                    .shadow(10.dp)
                    .padding(vertical = 10.dp)
            ) {
                Row {
                    Image(
                        painter = painterResource(id = productImage),
                        contentDescription = "first",
                        modifier = Modifier.fillMaxWidth(),
                        contentScale = ContentScale.FillWidth
                    )
                }
                //card body
                Row (
                    modifier = Modifier.fillMaxWidth()
                ){
                    Row(
                        modifier = Modifier.background(lightGrey)
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(vertical = 10.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = "  Shop : $productShop",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f))
                        Column {
                            Button(
                                onClick = { /*TODO*/ },
                                modifier = Modifier.background(mainBlue),
                                colors = ButtonDefaults.buttonColors(mainBlue)
                            ) {
                                Text(text = "View Shop")
                                
                            }
                        }
                    }



                }
                    //titleRow
                Row {
                    Text(
                        text = productName,
                        fontSize = 25.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.padding(start = 8.dp)
                        )
                }
               //price
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = "KSh.  $productPrice",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif,
                        modifier = Modifier.padding(start = 8.dp),
                        textAlign = TextAlign.End,
                        color = mainBlue
                    )
                }
                //Description
                Row {
                    Text(
                        text = productDescription,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }

            }
        }





@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExpressTopAppBar(title:String,routeBack :String,navHostController: NavHostController){
    TopAppBar(
        title = { Text(text = title,
            color = Color.White)},
        colors = TopAppBarDefaults.mediumTopAppBarColors(mainBlue),
        navigationIcon = {
            IconButton(onClick = {
navHostController.navigate(routeBack)
            }) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "ArrowBack",
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(20.dp))

            }
        },
        actions = {
            IconButton(onClick = {}) {


                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = "ArrowBack",
                    tint = Color.White
                )

                Spacer(modifier = Modifier.width(20.dp))
            }

            Icon(
                imageVector = Icons.Default.Settings,
                contentDescription = "ArrowBack",
                tint = Color.White
            )
            Spacer(modifier = Modifier.width(20.dp))


        })
}

@Preview(showBackground = true)
@Composable
fun CardPreview(){
//ExclusiveProductCard(
//    productName = "Name",
//    productDescription = "A very Good Product",
//    productPrice = 400 ,
//    productShop = "A popular Shop" ,
//    productImage = R.drawable.logo
//)
    ExpressTopAppBar(
        title = "Shops",
        routeBack = ROUT_HOME,
        rememberNavController()
    )
//    ProductCard(productName = "Logo", productDescription = "A blue logo for an online Mall", productPrice = 300, productShop ="Mine Mall",R.drawable.logo )
}