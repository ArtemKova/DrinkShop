package com.ka.drinkshop.domian

interface DrinkListRepository {
    fun addDrink(drinkItem: DrinkItem)

    fun delDrink(drinkItem: DrinkItem)

    fun getDrinkList():List<DrinkItem>

    fun editDrink(drinkItem: DrinkItem)

    fun getIdDrink (getId:Int):DrinkItem
}