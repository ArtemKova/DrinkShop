package com.ka.drinkshop.domian

class GetIdDrinkInteractor (private val drinkListRepository: DrinkListRepository) {
    fun getIdDrink (getId:Int):DrinkItem{
      return drinkListRepository.getIdDrink(getId)
    }
}