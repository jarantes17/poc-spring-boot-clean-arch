package com.example.pocspringcleanarch.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

const val PACKAGE_BASE = "com.example.pocspringcleanarch.*"

@SpringBootApplication(scanBasePackages = [PACKAGE_BASE])
@EnableJpaRepositories(value = [PACKAGE_BASE])
@EntityScan(basePackages = [PACKAGE_BASE])
class ApiApplication

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)
}
