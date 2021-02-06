package nivaldo.dh.exercise.android.home.model.repository

import nivaldo.dh.exercise.android.home.model.Restaurant

class RestaurantRepository {

    private val restaurantList = listOf(
        Restaurant(
            id = 1,
            name = "Tony Roma's",
            address = "Av. Lavandisca, 717 - Indianópolis, São Paulo",
            closingTime = "Fecha às 22:00",
            imageUrl = "https://github.com/nivaldomcj/dh-android-desafio2/raw/main/img/restaurants/01.jpg"
        ),
        Restaurant(
            id = 2,
            name = "Aoyama - Moema",
            address = "Alameda dos Arapanés, 532 - Moema",
            closingTime = "Fecha às 00:00",
            imageUrl = "https://github.com/nivaldomcj/dh-android-desafio2/raw/main/img/restaurants/02.jpg"
        ),
        Restaurant(
            id = 3,
            name = "Outback - Moema",
            address = "Av. Moaci, 187 - Moema, São Paulo",
            closingTime = "Fecha às 00:00",
            imageUrl = "https://github.com/nivaldomcj/dh-android-desafio2/raw/main/img/restaurants/03.jpg"
        ),
        Restaurant(
            id = 4,
            name = "Sí Señor!",
            address = "Alameda Jauaperi, 626 - Moema",
            closingTime = "Fecha às 01:00",
            imageUrl = "https://github.com/nivaldomcj/dh-android-desafio2/raw/main/img/restaurants/04.jpg"
        ),
    )

    fun getRestaurantsList(): List<Restaurant> {
        return restaurantList
    }

}