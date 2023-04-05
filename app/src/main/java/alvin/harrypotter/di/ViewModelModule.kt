package alvin.harrypotter.di

import alvin.harrypotter.ui.HouseType
import alvin.harrypotter.ui.detail.DetailViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { (type: HouseType) -> DetailViewModel(type, repository = get()) }
}