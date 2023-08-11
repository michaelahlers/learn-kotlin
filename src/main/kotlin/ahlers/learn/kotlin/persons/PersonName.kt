package ahlers.learn.kotlin.persons

data class PersonName(
        val givenName: String,
        val middleName: String? = null,
        val surname: String,
)
