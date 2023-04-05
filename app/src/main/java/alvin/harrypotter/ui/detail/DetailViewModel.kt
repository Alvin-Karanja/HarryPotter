package alvin.harrypotter.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import alvin.harrypotter.model.Character
import alvin.harrypotter.data.repository.Repository
import alvin.harrypotter.ui.HouseType

class DetailViewModel(house: HouseType, private val repository: Repository) : ViewModel() {

    val characterList : LiveData<List<Character>> = liveData {
        isLoading.value = true
        emit(repository.getCharacters(house.name))
        isLoading.value = false
    }

    val isLoading = MutableLiveData<Boolean>()

}