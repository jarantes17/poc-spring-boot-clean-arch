val springBootVersion: String by project

plugins {
    id("org.springframework.boot")
    kotlin("jvm")
}

dependencies {
    /* MODULE DEPENDENCIES */
    implementation(project(":common"))

    /* SPRING DEPENDENCIES */
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:$springBootVersion")

    /* KOTLIN DEPENDENCIES */
    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib-jdk8"))
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}