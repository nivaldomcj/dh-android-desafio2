package nivaldo.dh.exercise.android.home.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Restaurant(
    val id: Int = 0,
    val name: String = "",
    val address: String = "",
    val closingTime: String = "",
    val imageUrl: String = "",
) : Parcelable