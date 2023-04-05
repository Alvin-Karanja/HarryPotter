package alvin.harrypotter.di

import alvin.harrypotter.data.repository.Repository
import alvin.harrypotter.data.repository.RepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<Repository> { RepositoryImpl(remoteDataSource = get()) }
}