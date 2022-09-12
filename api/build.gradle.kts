val springBootVersion: String by project

plugins {
    id("org.springframework.boot")
    kotlin("jvm")
    kotlin("plugin.spring")
}

repositories {
    mavenCentral()
}

dependencies {
    /* MODULE DEPENDENCIES */
    implementation(project(":common"))
    implementation(project(":infrastructure"))
    implementation(project(":application"))
    implementation(project(":domain"))

    /* SPRING DEPENDENCIES */
    implementation("org.springframework.boot:spring-boot-starter-webflux:$springBootVersion")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:$springBootVersion")

    /* JACKSON DEPENDENCIES */
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    /* KOTLIN DEPENDENCIES */
    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib-jdk8"))
    implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")

    /* POSTGRES DEPENDENCIES */
    implementation("org.postgresql:postgresql:42.5.0")

    /* TESTS DEPENDENCIES */
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.projectreactor:reactor-test")
}