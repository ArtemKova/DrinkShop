package com.ka.drinkshop.domian

data class DrinkItem(

    val category:String,
    val name:String,
    val strength:String,
    val vol:String,
    val enabled:Boolean,
    var id:Int = UNDEFINDED_ID
){
    companion object{
        const val UNDEFINDED_ID = -1
    }
}
