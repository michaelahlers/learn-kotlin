package ahlers.learn.kotlin.basics.syntax

import ahlers.learn.kotlin.basics.Person

fun Person.show(): String {
    return """Person with name: ${this.name.show()}"""
}