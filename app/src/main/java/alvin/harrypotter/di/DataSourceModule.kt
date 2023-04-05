package alvin.harrypotter.di

import alvin.harrypotter.data.remote.RemoteDataSource
import alvin.harrypotter.data.remote.RemoteDataSourceImpl
import org.koin.dsl.module

val dataSourceModule = module {
    single<RemoteDataSource> { RemoteDataSourceImpl(service = get()) }
}