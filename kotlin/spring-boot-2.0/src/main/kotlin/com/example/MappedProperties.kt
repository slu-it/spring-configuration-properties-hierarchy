package com.example

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("properties")
class MappedProperties : BaseProperties() {
    var bar: String? = null
}
