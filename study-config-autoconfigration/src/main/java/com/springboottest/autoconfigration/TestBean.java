package com.springboottest.autoconfigration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Dean on 2017/3/21.
 */
@ConfigurationProperties(prefix = "testbean")
public class TestBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
