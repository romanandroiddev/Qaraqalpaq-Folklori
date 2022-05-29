package uz.project.qaraqalpaqfolklori.presenter.screens.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import uz.project.qaraqalpaqfolklori.domain.MainRepository

class SplashViewModel(private val mainRepository: MainRepository) : ViewModel() {
    private val isSignUpMutableLD: MutableLiveData<Boolean> = MutableLiveData()
    val isSignUpLD: LiveData<Boolean> = isSignUpMutableLD


//    fun start() {
//        viewModelScope.launch {
//            delay(2000)
////            isSignUpMutableLD.value = mainRepository.isSignUp()
//        }
//
//    }

}

