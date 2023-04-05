package alvin.harrypotter.data.remote

import alvin.harrypotter.model.Character

interface RemoteDataSource {

    suspend fun getCharacters(type: String) : List<Character>

}