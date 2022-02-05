package com.ka.drinkshop.domian

class GetDrinkListInteractor (private val drinkListRepository: DrinkListRepository) {
    fun getDrinkList():List<DrinkItem>{
       return drinkListRepository.getDrinkList()
    }
}