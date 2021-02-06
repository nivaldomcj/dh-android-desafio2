package nivaldo.dh.exercise.android.home.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import nivaldo.dh.exercise.android.home.model.Restaurant
import nivaldo.dh.exercise.android.home.model.business.RestaurantBusiness

class HomeViewModel(application: Application) : AndroidViewModel(application) {

    val onGetRestaurantsListResult: MutableLiveData<List<Restaurant>> = MutableLiveData()

    private val business by lazy {
        RestaurantBusiness()
    }

    fun getRestaurantsList() {
        val restaurantsList = business.getRestaurantsList()
        onGetRestaurantsListResult.postValue(restaurantsList)
    }

}