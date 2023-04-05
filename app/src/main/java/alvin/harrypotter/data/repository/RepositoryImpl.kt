package alvin.harrypotter.data.repository

import alvin.harrypotter.data.remote.RemoteDataSource

class RepositoryImpl(private val remoteDataSource: RemoteDataSource) : Repository {

    override suspend fun getCharacters(type: String) =
        remoteDataSource.getCharacters(type)

}