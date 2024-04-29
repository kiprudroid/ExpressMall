package com.shadrackkipruto.expressmall.model

data class Product(
    var productName :String,
    var productDescription:String,
    var productSeller :String,
    var productShop :String,
    var productCategory :String,
    var productPrice :Int,
    var productSold :Boolean
)
