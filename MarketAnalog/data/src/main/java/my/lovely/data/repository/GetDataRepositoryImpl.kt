package my.lovely.data.repository

import my.lovely.data.api.UserService
import my.lovely.domain.model.UserRequest
import my.lovely.domain.model.UserResponse
import my.lovely.domain.repository.GetDataRepository
import retrofit2.Response
import javax.inject.Inject

class GetDataRepositoryImpl @Inject constructor(private val dataService: UserService): GetDataRepository {
    override suspend fun getData(login: String): Response<UserResponse>?{
        return try{
            val result = dataService.sendUserGetInfo(userModel = UserRequest(login = login))
            result
        } catch (e: java.net.UnknownHostException){
            null
        }
    }
}