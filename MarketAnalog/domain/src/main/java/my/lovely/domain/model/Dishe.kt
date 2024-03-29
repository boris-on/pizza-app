package my.lovely.domain.model

import com.google.gson.annotations.SerializedName

data class Dishe(
    val description: String,
    val id: Int,
    val image_url: String,
    val name: String,
    val price: Int,
    //@SerializedName("tags")
    val tegs: List<String>,
    val weight: Int
)