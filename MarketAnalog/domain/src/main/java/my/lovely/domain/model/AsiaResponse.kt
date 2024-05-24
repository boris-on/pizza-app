package my.lovely.domain.model

import com.google.gson.annotations.SerializedName

data class AsiaResponse(
    @SerializedName("items")
    val dishes: List<Dishe>
)