package my.lovely.data.repository

import my.lovely.data.api.RegistrationService
import my.lovely.domain.model.RegistrationRequest
import my.lovely.domain.repository.RegistrationRepository
import retrofit2.Response
import javax.inject.Inject

class RegistrationRepositoryImpl @Inject constructor(private val registrationService: RegistrationService):
    RegistrationRepository {

    override suspend fun passwordRequest(login: String, password: String, email: String, phone: Int, adress: String): Response<Unit>? {
        return try{
            val result = registrationService.sendPostRegistration(registrationModel = RegistrationRequest(login = login, password = password, email = email, phone = phone, address = adress))
            result
        } catch (e: java.net.UnknownHostException){
            null
        }
    }
}