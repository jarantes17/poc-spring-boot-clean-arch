val springBootVersion: String by project

plugins {
    id("org.springframework.boot")
    kotlin("jvm")
}

dependencies {
    /* MODULE DEPENDENCIES */
    implementation(project(":common"))

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