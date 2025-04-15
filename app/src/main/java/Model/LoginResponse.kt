package Model

data class LoginResponse(
    val token: String,
    val userId: String
)