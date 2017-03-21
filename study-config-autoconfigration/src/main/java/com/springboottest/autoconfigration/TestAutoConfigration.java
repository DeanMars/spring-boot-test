package com.springboottest.autoconfigration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Dean on 2017/3/21.
 */
@Configuration
@EnableConfigurationProperties({TestBean.class})
public class TestAutoConfigration {

    @Bean
    public TestBean testBean(){
        return new TestBean();
    }

}
