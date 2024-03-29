package my.lovely.data.api

import my.lovely.domain.model.AsiaResponse

import retrofit2.Response
import retrofit2.http.GET

interface AsiaMenuDataService {

    @GET("a0b15c26-5759-47e4-b040-badb0ecc795b")
    suspend fun getAsiaMenu(): Response<AsiaResponse>

}