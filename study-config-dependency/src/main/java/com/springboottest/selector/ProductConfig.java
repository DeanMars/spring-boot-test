package com.springboottest.selector;

import com.springboottest.import1.TestPojo;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Dean on 2017/3/20.
 */
@Configuration
public class ProductConfig {

    @Bean
    @ConfigurationProperties(prefix = "testpojo.product")
    public TestPojo testPojoproduct(){
        return new TestPojo();
    }
}
