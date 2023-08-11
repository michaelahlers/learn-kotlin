package ahlers.learn.kotlin.persons.syntax

import ahlers.learn.kotlin.persons.PersonName

fun PersonName.show(): String {
    return listOf(
            this.surname,
            this.givenName,
            this.middleName,
    )
            .filterNotNull()
            .joinToString(", ")
}
