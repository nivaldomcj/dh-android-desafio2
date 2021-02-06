package nivaldo.dh.exercise.android.home.model.business

import nivaldo.dh.exercise.android.home.model.Restaurant
import nivaldo.dh.exercise.android.home.model.repository.RestaurantRepository

class RestaurantBusiness {

    private val repository by lazy {
        RestaurantRepository()
    }

    fun getRestaurantsList(): List<Restaurant> {
        return repository.getRestaurantsList()
    }

}