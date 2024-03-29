package my.lovely.domain.model

data class RegistrationRequest(
    val login: String,
    val email: String,
    val password: String,
    val phone: Int,
    val address: String
)