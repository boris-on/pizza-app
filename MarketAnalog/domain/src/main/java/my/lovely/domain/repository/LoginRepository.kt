package my.lovely.domain.repository

import retrofit2.Response

interface LoginRepository {
// sfdfsd
    suspend fun loginRequest(login: String, password: String) : Response<Unit>?
}