package uz.project.qaraqalpaqfolklori

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.airbnb.lottie.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber
import uz.project.qaraqalpaqfolklori.di.helperModule
import uz.project.qaraqalpaqfolklori.di.networkModule
import uz.project.qaraqalpaqfolklori.di.repositoryModule
import uz.project.qaraqalpaqfolklori.di.viewModelModule

class App : Application() {

    companion object {
        lateinit var instance: App
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())

        val modules = listOf(
            networkModule, viewModelModule, helperModule, repositoryModule
        )
        startKoin {
            androidLogger()
            androidContext(this@App)
            androidFileProperties()
            koin.loadModules(modules)
        }

    }
}