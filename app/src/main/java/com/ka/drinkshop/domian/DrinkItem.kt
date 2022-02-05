package com.ka.drinkshop.domian

data class DrinkItem(
    val id:Int,
    val category:String,
    val name:String,
    val strength:String,
    val vol:String,
    val enabled:Boolean
)
