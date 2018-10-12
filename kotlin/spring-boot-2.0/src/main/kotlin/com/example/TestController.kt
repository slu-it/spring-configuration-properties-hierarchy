package com.example

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
        private val properties: MappedProperties
) {

    @GetMapping("/test")
    fun get(): String {
        return properties.foo.xur + " " + properties.bar
    }

}
