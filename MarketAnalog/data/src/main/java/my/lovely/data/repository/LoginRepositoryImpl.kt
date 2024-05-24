package my.lovely.data.repository

import my.lovely.data.api.LoginService
import my.lovely.domain.model.LoginRequest
import my.lovely.domain.repository.LoginRepository
import retrofit2.Response
import javax.inject.Inject

class LoginRepositoryImpl @Inject constructor(private val loginService: LoginService):
    LoginRepository {

    override suspend fun loginRequest(login: String, password: String): Response<Unit>? {
        return try{
            val result = loginService.sendPostLogin(loginModel = LoginRequest(login = login, password = password))
            result
        } catch (e: java.net.UnknownHostException){
            null
        }
    }


}