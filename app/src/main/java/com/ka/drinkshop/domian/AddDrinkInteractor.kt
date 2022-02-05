package com.ka.drinkshop.domian

class AddDrinkInteractor(private val drinkListRepository: DrinkListRepository) {
    fun addDrink(drinkItem: DrinkItem) {
        drinkListRepository.addDrink(drinkItem)
    }
}