package com.jacqui.groceries.models

data class ProductItem(
    var title: String,
    var image: String,
    var price: String,
    var unit: String,
    var quantity: Double,
    var description: String
){}