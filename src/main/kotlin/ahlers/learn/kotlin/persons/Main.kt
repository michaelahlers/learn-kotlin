package ahlers.learn.kotlin.persons

import ahlers.learn.kotlin.persons.syntax.*

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
