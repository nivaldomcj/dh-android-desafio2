package nivaldo.dh.exercise.android.home.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import nivaldo.dh.exercise.android.R
import nivaldo.dh.exercise.android.databinding.ItemRecipeBinding
import nivaldo.dh.exercise.android.home.model.Recipe

class RecipeAdapter(
    private val recipesList: List<Recipe>,
    private val onRecipeClicked: (Recipe) -> Unit
) : RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemRecipeBinding.inflate(layoutInflater, parent, false)
        return RecipeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.bind(recipesList[position], onRecipeClicked)
    }

    override fun getItemCount(): Int {
        return recipesList.size
    }

    class RecipeViewHolder(
        private val binding: ItemRecipeBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(recipe: Recipe, onRecipeClicked: (Recipe) -> Unit) = with(binding) {
            tvRecipeName.text = recipe.name

            Glide.with(itemView.context)
                .load(recipe.imageUrl)
                .centerCrop()
                .placeholder(R.drawable.layer_img_loading)
                .into(ivRecipeImage)

            itemView.setOnClickListener {
                onRecipeClicked(recipe)
            }
        }

    }

}