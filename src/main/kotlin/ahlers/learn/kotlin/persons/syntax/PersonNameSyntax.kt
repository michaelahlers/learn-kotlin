package ahlers.learn.kotlin.persons.syntax

import ahlers.learn.kotlin.persons.PersonName

fun PersonName.show(): String {
    return "${this.surname}, ${
        listOf(this.givenName, this.middleName)
                .filterNotNull()
                .joinToString(" ")
    }"
}
