val springBootVersion: String by project

plugins {
    id("org.springframework.boot")
    kotlin("jvm")
}

dependencies {
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