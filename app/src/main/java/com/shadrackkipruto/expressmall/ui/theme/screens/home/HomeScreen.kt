package com.shadrackkipruto.expressmall.ui.theme.screens.home

import androidx.compose.foundation.Image
import com.shadrackkipruto.expressmall.ui.theme.mainBlue
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
//import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
//import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.shadrackkipruto.expressmall.R
import com.shadrackkipruto.expressmall.navigation.BottomAppBarExample
import com.shadrackkipruto.expressmall.navigation.ExclusiveProductCard
import com.shadrackkipruto.expressmall.navigation.ProductCard
import org.w3c.dom.Text

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
Column (
    modifier = Modifier.fillMaxSize()
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(mainBlue),
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier.width(100.dp)
        )
    } //End of Logo Row
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(mainBlue)
            .height(100.dp),

        horizontalArrangement = Arrangement.Center
    ) {
//Category Dropdown Menu
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 25.dp,)
                ,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var category by  remember {
                mutableStateOf("")
            }
            val list = listOf("Electronics", "Clothing", "Kitchen", "Furniture")
            var isExpanded by remember {
                mutableStateOf(false)
            }

            ExposedDropdownMenuBox(
                expanded = isExpanded,
                onExpandedChange = { isExpanded = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)

            ) {
                TextField(
                    value = category,
                    placeholder = { Text(text = "Select Category")},
                    readOnly = true,
                    onValueChange = { category = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .menuAnchor(),
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)
                    },
                    colors = ExposedDropdownMenuDefaults.textFieldColors(),
                )
                ExposedDropdownMenu(expanded = isExpanded,
                    onDismissRequest = {
                        isExpanded = false
                    }) {

                  list.forEach{item ->
                      DropdownMenuItem(text = { Text(text = item) },
                          onClick = { category = item ;
                              isExpanded = false
                            })
                  }
                }


            }


        }



    }

    Column(modifier = Modifier
        .weight(1f)
        .background(Color.White)
        .fillMaxSize()
        .padding(
            horizontal = 10.dp,
            vertical = 10.dp
        )
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
        ) {


            ExclusiveProductCard(
                productName = "Name",
                productDescription = "A very Good Product",
                productPrice = 400,
                productShop = "A popular Shop",
                productImage = R.drawable.logo
            )
            ExclusiveProductCard(
                productName = "Wooden Table",
                productDescription = "A brown Wooden Table",
                productPrice = 4000,
                productShop = "Kimani's Furniture",
                productImage = R.drawable.img_3
            )
            ExclusiveProductCard(
                productName = "Wooden Table",
                productDescription = "A brown Wooden Table",
                productPrice = 4000,
                productShop = "Kimani's Furniture",
                productImage = R.drawable.img_3
            )
        }

    }


    BottomAppBarExample(tint1 = Color.Black, navHostController = navController)


}

}


@Preview()
@Composable
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())
}