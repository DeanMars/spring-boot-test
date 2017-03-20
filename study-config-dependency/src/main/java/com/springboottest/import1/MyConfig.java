package com.springboottest.import1;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Dean on 2017/3/20.
 */
@Configuration
public class MyConfig {

    @Bean
    @ConfigurationProperties(prefix = "testpojo")
    public TestPojo testPojo(){
        return new TestPojo();
    }


}
