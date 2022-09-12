val springBootVersion: String by project

plugins {
    id("org.springframework.boot")
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    /* MODULE DEPENDENCIES */
    implementation(project(":common"))
    implementation(project(":domain"))
    implementation(project(":infrastructure"))

    /* KOTLIN DEPENDENCIES */
    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib-jdk8"))

    /* SPRING DEPENDENCIES */
    implementation("org.springframework.boot:spring-boot-starter-validation:$springBootVersion")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:$springBootVersion")
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}