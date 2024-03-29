package my.lovely.domain.usecase

import android.util.Log
import my.lovely.domain.repository.LoginRepository
import retrofit2.Response
import javax.inject.Inject

class RequestLoginUseCase @Inject constructor(private val loginRepository: LoginRepository) {

    suspend fun getLoginResponse(login: String, password: String): Response<Unit>? {
        val result = loginRepository.loginRequest(login = login, password = password)
        Log.d("с","В UseCase ${result?.body() ?: null}")
        return result
    }

}