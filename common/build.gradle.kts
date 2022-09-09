val springBootVersion: String by project

plugins {
    id("org.springframework.boot")
    kotlin("jvm")
    kotlin("plugin.spring")
    kotlin("plugin.jpa")
}

dependencies {
    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib-jdk8"))

    implementation("org.springframework:spring-context:5.3.22")
    implementation("org.springframework.hateoas:spring-hateoas:1.12.11")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.4")
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}