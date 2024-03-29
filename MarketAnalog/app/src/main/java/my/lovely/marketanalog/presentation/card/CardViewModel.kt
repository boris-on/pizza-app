package my.lovely.marketanalog.presentation.card

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import my.lovely.domain.usecase.GetBasketDaoDbUseCase
import javax.inject.Inject

class CardViewModel @Inject constructor(
    private val getBasketDaoDbUseCase: GetBasketDaoDbUseCase,
): ViewModel() {


    fun clearDB() = viewModelScope.launch(Dispatchers.IO) {
        getBasketDaoDbUseCase.getDaoDb().deleteAllDishes()
    }

}