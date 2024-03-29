package my.lovely.domain.repository

import retrofit2.Response

interface RegistrationRepository {

    suspend fun passwordRequest(login: String, password: String, email: String, phone: Int, adress: String) : Response<Unit>?
}