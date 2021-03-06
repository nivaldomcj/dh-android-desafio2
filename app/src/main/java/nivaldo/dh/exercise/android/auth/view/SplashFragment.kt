package nivaldo.dh.exercise.android.auth.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import nivaldo.dh.exercise.android.auth.viewmodel.SplashViewModel
import nivaldo.dh.exercise.android.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {

    private lateinit var splashViewModel: SplashViewModel
    private lateinit var binding: FragmentSplashBinding

    private fun initSplashScreen() {
        splashViewModel.getSplashScreen()
        splashViewModel.onSplashResult.observe(viewLifecycleOwner, {
            val action = SplashFragmentDirections.actionSplashFragmentToLoginFragment()
            findNavController().navigate(action)
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        splashViewModel = ViewModelProvider(this).get(SplashViewModel::class.java)
        initSplashScreen()
    }


}