package com.example.environmentlab

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.core.env.Environment
import org.springframework.core.env.get
import org.springframework.stereotype.Component

@Component
class MicroServiceManager(
    @Value("\${service.microservice-a.host}") private val host: String,
    private val microServiceProperties: MicroServiceProperties,
    environment: Environment
) {
    init {
        println(environment.get("service.microservice-a.host"))
    }
}

@ConfigurationProperties("service.microservice-a")
class MicroServiceProperties(val host: String)
