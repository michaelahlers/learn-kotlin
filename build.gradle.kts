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
    implementation(platform("io.arrow-kt:arrow-stack:1.2.0"))
    implementation("io.arrow-kt:arrow-core")
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
