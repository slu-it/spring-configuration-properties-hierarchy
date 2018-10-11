package com.example.configproperties;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final MappedProperties properties;

    public TestController(MappedProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/test")
    public String get() {
        return properties.getFoo() + " " + properties.getBar();
    }

}
