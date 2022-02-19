package com.ka.drinkshop.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ka.drinkshop.data.DrinkListRepositoryImpl
import com.ka.drinkshop.domian.DelDrinkInteractor
import com.ka.drinkshop.domian.DrinkItem
import com.ka.drinkshop.domian.EditDrinkInteractor
import com.ka.drinkshop.domian.GetDrinkListInteractor

class MainViewModel : ViewModel() {

    private val repository = DrinkListRepositoryImpl

    private val getDrinkListInteractor = GetDrinkListInteractor(repository)
    private val delDrinkInteractor = DelDrinkInteractor(repository)
    private val editDrinkInteractor = EditDrinkInteractor(repository)

    val drinkList = MutableLiveData<List<DrinkItem>>()

    fun getDrinkList() {
        val list = getDrinkListInteractor.getDrinkList()
        drinkList.postValue(list)
    }

    fun delDrinkInterator(drinkItem: DrinkItem) {
        delDrinkInteractor.delDrink(drinkItem)
        getDrinkList()
    }

    fun editDrinkInteractor(drinkItem: DrinkItem){
       val newDrinkItem = drinkItem.copy(enabled = !drinkItem.enabled)
        editDrinkInteractor.editDrink(newDrinkItem)
        getDrinkList()
    }
}