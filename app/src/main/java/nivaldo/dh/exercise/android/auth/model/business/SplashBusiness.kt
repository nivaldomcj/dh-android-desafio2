package nivaldo.dh.exercise.android.auth.model.business

import nivaldo.dh.exercise.android.auth.model.Splash
import nivaldo.dh.exercise.android.auth.model.repository.SplashRepository

class SplashBusiness {

    private val repository by lazy {
        SplashRepository()
    }

    fun getSplashResult(): Splash {
        return repository.getSplashResult()
    }

}