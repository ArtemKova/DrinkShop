package com.ka.drinkshop.domian

class DelDrinkInteractor(private val drinkListRepository: DrinkListRepository) {
    fun delDrink(drinkItem: DrinkItem){
        drinkListRepository.delDrink(drinkItem)

    }
}