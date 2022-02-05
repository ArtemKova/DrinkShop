package com.ka.drinkshop.domian

class GetIdDrinkInteractor (private val drinkListRepository: DrinkListRepository) {
    fun getIdDrink (getId:DrinkItem):DrinkItem{
      return drinkListRepository.getIdDrink(getId)
    }
}