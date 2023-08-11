plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "ahlers.learn.kotlin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(20)

    compilerOptions {
        allWarningsAsErrors = true
    }
}

application {
    mainClass.set("ahlers.learn.kotlin.HelloWorldKt")
}