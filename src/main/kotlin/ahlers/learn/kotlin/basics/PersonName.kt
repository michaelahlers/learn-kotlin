package ahlers.learn.kotlin.basics

data class PersonName(
    val givenName: String,
    val middleName: String? = null,
    val surname: String,
)
