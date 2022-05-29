package uz.project.qaraqalpaqfolklori.presenter.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import uz.project.qaraqalpaqfolklori.domain.MainRepository


class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {
    private val isSignUpMutableLD: MutableLiveData<Boolean> = MutableLiveData()

}



