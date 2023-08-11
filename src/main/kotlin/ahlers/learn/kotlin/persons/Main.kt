package ahlers.learn.kotlin.persons

import ahlers.learn.kotlin.persons.syntax.*

fun main(
        @Suppress("UNUSED_PARAMETER") arguments: Array<String>
) {
    val persons =
            listOf(
                    Person(
                            name = PersonName(
                                    givenName = "Dmitry",
                                    surname = "Jemerov",
                            )
                    ),
                    Person(
                            name = PersonName(
                                    givenName = "Michael",
                                    middleName = "Carey",
                                    surname = "Ahlers",
                            )
                    ),
            )

    println("Hello, ${persons.map { it.show() }.joinToString("; ")}!")
}
