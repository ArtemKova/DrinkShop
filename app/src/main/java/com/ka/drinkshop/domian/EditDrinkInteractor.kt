package com.ka.drinkshop.domian

class EditDrinkInteractor(private val drinkListRepository: DrinkListRepository) {
    fun editDrink(drinkItem: DrinkItem) {
        drinkListRepository.editDrink(drinkItem)
    }
}