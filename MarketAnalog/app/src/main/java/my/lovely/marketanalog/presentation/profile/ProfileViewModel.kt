package my.lovely.marketanalog.presentation.profile

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import my.lovely.domain.model.UserResponse
import my.lovely.domain.usecase.RequestRegistrationUseCase
import my.lovely.domain.usecase.ResponseUserInfoUseCase
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(private val responseUserInfoUseCase: ResponseUserInfoUseCase) : ViewModel() {

    private var requestUserInfoLiveData = MutableLiveData<UserResponse>()
    private var progressBarLiveData = MutableLiveData<Boolean>()

    val userInfo: LiveData<UserResponse>
        get() = requestUserInfoLiveData

    val progressBar: LiveData<Boolean>
        get() = progressBarLiveData

    fun getUserInfo(login: String) = viewModelScope.launch(
        Dispatchers.IO) {
        try{
            progressBarLiveData.postValue(true)
            var result = responseUserInfoUseCase.getUserResponse(login = login)
            requestUserInfoLiveData.postValue(result?.body() ?: null)
            if (result != null) {
                Log.d("MyLog",result.raw().toString())
            }
            progressBarLiveData.postValue(false)

        } catch (e: Exception){
            progressBarLiveData.postValue(false)
            Log.d("MyLog",e.toString())
        }
    }
}
