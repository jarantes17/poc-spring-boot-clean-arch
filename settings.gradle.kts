
rootProject.name = "poc-spring-clean-arch"

pluginManagement {
    val springBootVersion: String by settings
    val pluginsVersion: String by settings
    val springManagementVersion: String by settings

    plugins {
        id("org.springframework.boot") version springBootVersion
        id("io.spring.dependency-management") version springManagementVersion

        kotlin("jvm") version pluginsVersion
        kotlin("plugin.spring") version pluginsVersion
        kotlin("plugin.jpa") version pluginsVersion
    }
}

include("api")
include("domain")
include("infrastructure")
include("application")
include("common")
