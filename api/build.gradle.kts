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
    implementation("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:$springBootVersion")

    /* JACKSON DEPENDENCIES */
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    /* OPEN API DEPENDENCIES */
    implementation("org.springdoc:springdoc-openapi-ui:1.6.11")
    implementation("org.springdoc:springdoc-openapi-kotlin:1.6.11")

    /* KOTLIN DEPENDENCIES */
    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib-jdk8"))

    /* POSTGRES DEPENDENCIES */
    implementation("org.postgresql:postgresql:42.5.0")

    /* TESTS DEPENDENCIES */
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.projectreactor:reactor-test")
}