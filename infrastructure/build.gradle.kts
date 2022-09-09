plugins {
    kotlin("jvm") version "1.7.10"
}

group = "com.example.pocspringcleanarch.infrastructure"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}