package nivaldo.dh.exercise.android.home.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import nivaldo.dh.exercise.android.R
import nivaldo.dh.exercise.android.databinding.ItemRestaurantBinding
import nivaldo.dh.exercise.android.home.model.Restaurant

class RestaurantAdapter(
    private val restaurantsList: List<Restaurant>,
    private val onRestaurantClicked: (Restaurant) -> Unit
) : RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemRestaurantBinding.inflate(layoutInflater, parent, false)
        return RestaurantViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        holder.bind(restaurantsList[position], onRestaurantClicked)
    }

    override fun getItemCount(): Int {
        return restaurantsList.size
    }

    class RestaurantViewHolder(
        private val binding: ItemRestaurantBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(
            restaurant: Restaurant,
            onRestaurantClicked: (Restaurant) -> Unit
        ) = with(binding) {
            Glide.with(itemView.context)
                .load(restaurant.imageUrl)
                .centerCrop()
                .placeholder(R.drawable.layer_img_loading)
                .into(ivRestaurantImage)

            tvRestaurantName.text = restaurant.name
            tvRestaurantAddress.text = restaurant.address
            tvRestaurantClosingTime.text = restaurant.closingTime

            itemView.setOnClickListener {
                onRestaurantClicked(restaurant)
            }
        }

    }

}