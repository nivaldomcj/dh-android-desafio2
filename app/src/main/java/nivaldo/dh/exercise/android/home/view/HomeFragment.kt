package nivaldo.dh.exercise.android.home.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import nivaldo.dh.exercise.android.databinding.FragmentHomeBinding
import nivaldo.dh.exercise.android.home.model.Restaurant
import nivaldo.dh.exercise.android.home.view.adapter.RestaurantAdapter
import nivaldo.dh.exercise.android.home.viewmodel.HomeViewModel

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var binding: FragmentHomeBinding

    private fun loadRestaurantsRecyclerView(restaurantsList: List<Restaurant>) {
        binding.rvRestaurants.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = RestaurantAdapter(restaurantsList) {
                val action = HomeFragmentDirections.actionHomeFragmentToRestaurantDetailFragment(it)
                findNavController().navigate(action)
            }
        }
    }

    private fun initObservables() {
        homeViewModel.getRestaurantsList()
        homeViewModel.onGetRestaurantsListResult.observe(viewLifecycleOwner, {
            loadRestaurantsRecyclerView(it)
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        initObservables()
    }
}