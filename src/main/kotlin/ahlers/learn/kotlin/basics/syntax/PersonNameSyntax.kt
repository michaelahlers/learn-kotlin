package ahlers.learn.kotlin.basics.syntax

import ahlers.learn.kotlin.basics.PersonName

fun PersonName.show(): String {
    return listOf(
        this.surname,
        this.givenName,
        this.middleName,
    )
        .filterNotNull()
        .joinToString(", ")
}