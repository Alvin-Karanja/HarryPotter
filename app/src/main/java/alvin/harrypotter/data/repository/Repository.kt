package alvin.harrypotter.data.repository

import alvin.harrypotter.model.Character

interface Repository {

    suspend fun getCharacters(type: String) : List<Character>

}