package my.lovely.data.api

import my.lovely.domain.model.AsiaResponse

import retrofit2.Response
import retrofit2.http.GET

interface AsiaMenuDataService {

    @GET("getAllDishes")
    suspend fun getAsiaMenu(): Response<AsiaResponse>

}