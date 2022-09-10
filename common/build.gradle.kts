val springBootVersion: String by project

plugins {
    id("org.springframework.boot")
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    /* KOTLIN DEPENDENCIES */
    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib-jdk8"))

    /* SPRING DEPENDENCIES */
    implementation("org.springframework:spring-context:5.3.22")
    implementation("org.springframework.hateoas:spring-hateoas:1.5.1")

    /* JACKSON DEPENDENCIES */
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}