package nivaldo.dh.exercise.android.home.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import nivaldo.dh.exercise.android.databinding.FragmentRestaurantDetailBinding
import nivaldo.dh.exercise.android.home.model.Recipe
import nivaldo.dh.exercise.android.home.model.Restaurant
import nivaldo.dh.exercise.android.home.view.adapter.RecipeAdapter
import nivaldo.dh.exercise.android.home.viewmodel.RestaurantDetailViewModel

class RestaurantDetailFragment : Fragment() {

    private lateinit var restaurantDetailViewModel: RestaurantDetailViewModel
    private lateinit var binding: FragmentRestaurantDetailBinding
    private val args: RestaurantDetailFragmentArgs by navArgs()

    private fun loadRestaurantRecipesRecyclerView(recipesList: List<Recipe>) {
        binding.rvRecipes.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = RecipeAdapter(recipesList) {
                val action = RestaurantDetailFragmentDirections
                    .actionRestaurantDetailFragmentToRecipeDetailFragment(it)

                findNavController().navigate(action)
            }
        }
    }

    private fun loadRestaurantDetail() {
        args.restaurant.let {
            binding.toolbarLayout.title = it.name

            Glide.with(this)
                .load(it.imageUrl)
                .centerCrop()
                .into(binding.ivRestaurantCover)

            restaurantDetailViewModel.getRestaurantRecipes(it)
        }
    }

    private fun initObservables() {
        restaurantDetailViewModel.onGetRestaurantRecipesResult.observe(viewLifecycleOwner, {
            loadRestaurantRecipesRecyclerView(it)
        })
    }

    private fun initActionBar() {
        val navController = findNavController()
        val appBarConfiguration = AppBarConfiguration(navController.graph)

        binding.toolbar.setupWithNavController(navController, appBarConfiguration)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRestaurantDetailBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        restaurantDetailViewModel =
            ViewModelProvider(this).get(RestaurantDetailViewModel::class.java)

        initActionBar()
        initObservables()
        loadRestaurantDetail()
    }

}