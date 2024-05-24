package my.lovely.data.api

import my.lovely.domain.model.DataResponse
import retrofit2.Response
import retrofit2.http.GET

interface CatalogDataService{
    @GET("d0e32d63-5d01-4dd3-bb07-5cf2409e362a")
    suspend fun getCatalog(): Response<DataResponse>

}