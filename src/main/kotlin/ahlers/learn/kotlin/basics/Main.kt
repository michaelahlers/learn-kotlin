package ahlers.learn.kotlin.basics

import ahlers.learn.kotlin.basics.syntax.*

fun main(
    @Suppress("UNUSED_PARAMETER") arguments: Array<String>
) {
    val person = Person(
        name = PersonName(
            givenName = "Dmitry",
            surname = "Jemerov",
        )
    )

    println("Hello, ${person.show()}!")
}