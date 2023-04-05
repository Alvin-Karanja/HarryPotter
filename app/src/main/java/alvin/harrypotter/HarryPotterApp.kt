package alvin.harrypotter

import android.app.Application
import alvin.harrypotter.di.dataSourceModule
import alvin.harrypotter.di.networkModule
import alvin.harrypotter.di.repositoryModule
import alvin.harrypotter.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class HarryPotterApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@HarryPotterApp)
            modules(dataSourceModule)
            modules(repositoryModule)
            modules(viewModelModule)
            modules(networkModule)
        }
    }

}