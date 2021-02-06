package nivaldo.dh.exercise.android.home.model.business

import nivaldo.dh.exercise.android.home.model.Recipe
import nivaldo.dh.exercise.android.home.model.Restaurant
import nivaldo.dh.exercise.android.home.model.repository.RecipeRepository

class RecipeBusiness {

    private val repository by lazy {
        RecipeRepository()
    }

    fun getRestaurantRecipes(restaurant: Restaurant): List<Recipe> {
        return repository.getRestaurantRecipes(restaurant)
    }

}