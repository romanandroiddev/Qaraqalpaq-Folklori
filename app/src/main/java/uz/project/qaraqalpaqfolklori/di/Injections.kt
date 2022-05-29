package uz.project.qaraqalpaqfolklori.di

import com.google.firebase.firestore.FirebaseFirestore
import com.google.gson.GsonBuilder
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module
import uz.project.qaraqalpaqfolklori.domain.MainRepository
import uz.project.qaraqalpaqfolklori.domain.MainRepositoryImpl
import uz.project.qaraqalpaqfolklori.local.sharepref.SharePref

val networkModule = module {
    single {
        GsonBuilder().setLenient().create()
    }

    single { FirebaseFirestore.getInstance() }
}

val helperModule = module {
    single { SharePref(androidApplication().applicationContext) }

}

val repositoryModule = module {
    single<MainRepository> { MainRepositoryImpl(get(), get()) }
}


val viewModelModule = module {
//    viewModel { SplashViewModel(get()) }
}

