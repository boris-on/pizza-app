package my.lovely.data.api

import my.lovely.domain.model.DataResponse
import retrofit2.Response
import retrofit2.http.GET

interface CatalogDataService{
    @GET("9c190ed4-f371-4a71-9511-00fdb6ca1790")
    suspend fun getCatalog(): Response<DataResponse>

}