package ahlers.learn.kotlin.basics.syntax

import ahlers.learn.kotlin.basics.Person

fun Person.show(): String {
    return """person (name: ${this.name.show()})"""
}