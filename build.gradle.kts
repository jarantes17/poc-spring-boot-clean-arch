import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {

    id("org.springframework.boot") apply false
    id("io.spring.dependency-management") apply false

    kotlin("jvm") apply false
    kotlin("plugin.spring") apply false
    kotlin("plugin.jpa") apply false
}


allprojects {
    group = "com.example.pocspringcleanarch"
    version = "0.0.1-SNAPSHOT"

    tasks.withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "17"
        }
    }
}

subprojects {
    repositories {
        mavenCentral()
    }
    apply {
        plugin("io.spring.dependency-management")
        plugin("java")
        plugin("org.jetbrains.kotlin.jvm")
    }
    dependencies {
        val implementation by configurations
        implementation(project(":common"))
    }
}