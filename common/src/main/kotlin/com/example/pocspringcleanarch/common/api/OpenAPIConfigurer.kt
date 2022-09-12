package com.example.pocspringcleanarch.common.api

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

open class OpenAPIConfigurer : WebMvcConfigurer {

    @Bean
    open fun commonOpenAPI(
        @Value("\${openapi.version}") appVersion: String,
        @Value("\${openapi.title}") appTitle: String,
        @Value("\${openapi.description}") appDescription: String
    ): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title(appTitle)
                    .version(appVersion)
                    .description(appDescription)
            )
    }
}