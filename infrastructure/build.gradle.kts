val springBootVersion: String by project
val pluginsVersion: String by project

plugins {
    id("org.springframework.boot")
    kotlin("jvm")
    kotlin("plugin.spring")
    kotlin("plugin.jpa")
}

group = "com.example.pocspringcleanarch.infrastructure"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    /* MODULE DEPENDENCIES */
    implementation(project(":domain"))

    /* KOTLIN DEPENDENCIES */
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("org.slf4j:slf4j-api:2.0.0")

    /* SPRING DEPENDENCIES */
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:$springBootVersion")

    /* JACKSON DEPENDENCIES */
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.4")
}

buildscript {
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-noarg:1.7.10")
    }
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}