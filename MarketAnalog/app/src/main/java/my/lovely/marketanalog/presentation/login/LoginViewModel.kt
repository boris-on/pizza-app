package my.lovely.marketanalog.presentation.login

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import my.lovely.domain.model.RegistrationResponse
import my.lovely.domain.usecase.RequestLoginUseCase
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val requestLoginUseCase: RequestLoginUseCase) : ViewModel() {

    private var requestLoginLiveData = MutableLiveData<RegistrationResponse>()
    private var progressBarLiveData = MutableLiveData<Boolean>()

    val login: LiveData<RegistrationResponse>
        get() = requestLoginLiveData

    val progressBar: LiveData<Boolean>
        get() = progressBarLiveData

    fun sendPostLogin(login: String, password: String) = viewModelScope.launch(Dispatchers.IO) {
        try{
            progressBarLiveData.postValue(true)
            var result = requestLoginUseCase.getLoginResponse(login = login, password = password)
            requestLoginLiveData.postValue(
                RegistrationResponse(
                    code = result?.code() ?: null,
                    message = result?.message().toString()
                )
            )
            if (result != null) {
                Log.d("MyLog",result.code().toString())
            }
            progressBarLiveData.postValue(false)
        } catch (e: Exception){
            Log.d("MyLog",e.toString())
            progressBarLiveData.postValue(false)
        }
    }


}