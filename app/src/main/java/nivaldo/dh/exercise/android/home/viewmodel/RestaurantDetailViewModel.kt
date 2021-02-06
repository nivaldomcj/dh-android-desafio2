package nivaldo.dh.exercise.android.home.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import nivaldo.dh.exercise.android.home.model.Recipe
import nivaldo.dh.exercise.android.home.model.Restaurant
import nivaldo.dh.exercise.android.home.model.business.RecipeBusiness

class RestaurantDetailViewModel(application: Application) : AndroidViewModel(application) {

    val onGetRestaurantRecipesResult: MutableLiveData<List<Recipe>> = MutableLiveData()

    private val business by lazy {
        RecipeBusiness()
    }

    fun getRestaurantRecipes(restaurant: Restaurant) {
        val recipesList = business.getRestaurantRecipes(restaurant)
        onGetRestaurantRecipesResult.postValue(recipesList)
    }

}