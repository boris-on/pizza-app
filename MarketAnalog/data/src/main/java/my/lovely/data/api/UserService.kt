package my.lovely.data.api

import my.lovely.domain.model.RegistrationRequest
import my.lovely.domain.model.UserRequest
import my.lovely.domain.model.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserService {

    @POST("/user/get")
    suspend fun sendUserGetInfo(@Body userModel: UserRequest): Response<UserResponse>
}