package my.lovely.domain.repository

import my.lovely.domain.model.DataResponse
import my.lovely.domain.model.UserResponse
import retrofit2.Response

interface GetDataRepository {

    suspend fun getData(login: String): Response<UserResponse>?
}