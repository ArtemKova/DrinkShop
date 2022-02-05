package com.ka.drinkshop.data

import com.ka.drinkshop.domian.DrinkItem
import com.ka.drinkshop.domian.DrinkItem.Companion.UNDEFINDED_ID
import com.ka.drinkshop.domian.DrinkListRepository
import java.lang.RuntimeException

object DrinkListRepositoryImpl:DrinkListRepository {

    private val drinkList = mutableListOf<DrinkItem>()
    private var autoIncrementId = 0
    override fun addDrink(drinkItem: DrinkItem) {

        if (drinkItem.id == UNDEFINDED_ID) {
            drinkItem.id = autoIncrementId++
        }

      drinkList.add(drinkItem)
    }

    override fun delDrink(drinkItem: DrinkItem) {
       drinkList.remove(drinkItem)
    }

    override fun getDrinkList(): List<DrinkItem> {
       return drinkList.toMutableList()
    }

    override fun editDrink(drinkItem: DrinkItem) {
        val oldElement = getIdDrink(drinkItem.id)
        drinkList.remove(oldElement)
        addDrink(drinkItem)
    }

    override fun getIdDrink(getId: Int): DrinkItem {
        return drinkList.find{it.id == getId }
            ?: throw RuntimeException("Element with $getId not found")
    }
}