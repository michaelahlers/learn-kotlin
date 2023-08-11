package ahlers.learn.kotlin.persons.syntax

import ahlers.learn.kotlin.persons.Person

fun Person.show(): String {
    return """person (name: ${this.name.show()})"""
}
