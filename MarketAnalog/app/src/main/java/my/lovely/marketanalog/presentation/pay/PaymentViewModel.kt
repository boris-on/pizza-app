package my.lovely.marketanalog.presentation.pay

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import my.lovely.domain.usecase.GetBasketDaoDbUseCase
import javax.inject.Inject


@HiltViewModel
class PaymentViewModel @Inject constructor(
    private val getBasketDaoDbUseCase: GetBasketDaoDbUseCase,
): ViewModel() {


    fun clearDB() = viewModelScope.launch(Dispatchers.IO) {
        getBasketDaoDbUseCase.getDaoDb().deleteAllDishes()
    }

}