package my.lovely.data.api

import my.lovely.domain.model.LoginRequest
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginService {

    @POST("login")
    suspend fun sendPostLogin(@Body loginModel: LoginRequest): Response<Unit>
}