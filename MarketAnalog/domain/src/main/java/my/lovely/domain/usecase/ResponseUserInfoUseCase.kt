package my.lovely.domain.usecase

import android.util.Log
import my.lovely.domain.model.UserResponse
import my.lovely.domain.repository.GetDataRepository
import my.lovely.domain.repository.RegistrationRepository
import retrofit2.Response
import javax.inject.Inject

class ResponseUserInfoUseCase @Inject constructor(private val getDataRepository: GetDataRepository) {

    suspend fun getUserResponse(login: String): Response<UserResponse>? {
        val result = getDataRepository.getData(login = login)
        Log.d("MyLog", "В UseCase reg ${result?.body() ?: null}")
        return result
    }
}