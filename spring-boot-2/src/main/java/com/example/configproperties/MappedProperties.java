package com.example.configproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("properties")
public class MappedProperties extends BaseProperties {

    private String bar;

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

}
