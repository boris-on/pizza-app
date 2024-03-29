package my.lovely.domain.usecase

import android.util.Log
import my.lovely.domain.repository.RegistrationRepository
import retrofit2.Response
import javax.inject.Inject

class RequestRegistrationUseCase @Inject constructor(private val registrationRepository: RegistrationRepository) {

    suspend fun getRegistrationResponse(login: String, password: String, email: String, phone: Int, adress: String): Response<Unit>? {
        val result = registrationRepository.passwordRequest(login = login, password = password, email = email, phone = phone, adress = adress)
        Log.d("MyLog", "В UseCase reg ${result?.body() ?: null}")
        return result
    }
}