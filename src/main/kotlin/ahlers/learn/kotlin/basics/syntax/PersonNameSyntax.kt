package ahlers.learn.kotlin.basics.syntax

import ahlers.learn.kotlin.basics.PersonName

fun PersonName.show(): String {
    return "${this.surname}, ${this.givenName}"
}