package nivaldo.dh.exercise.android.home.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Recipe(
    val id: Int = 0,
    val restaurantId: Int = 0,
    val name: String = "",
    val description: String = "",
    val imageUrl: String = "",
) : Parcelable