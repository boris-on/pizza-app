package my.lovely.data.api

import my.lovely.domain.model.RegistrationRequest
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface RegistrationService {

    @POST("/register")
    suspend fun sendPostRegistration(@Body registrationModel: RegistrationRequest): Response<Unit>
}