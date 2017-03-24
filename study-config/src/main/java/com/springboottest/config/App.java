package com.springboottest.config;

import com.springboottest.config.config.ConfigrationJSR303;
import com.springboottest.config.config.Configration01;
import com.springboottest.register.EnableMyRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//@EnableMyConfig
//@EnableMySelector(value = SelectMode.MODE_TEST)
@EnableMyRegister(name = "fgdhfdhgdf")
public class App {
    public static void main( String[] args ){
        SpringApplication.run(App.class,args);
    }

    

    @Bean
    @ConfigurationProperties(prefix = "my")
    public Configration01 configration01(){
        return new Configration01();
    }


    @Bean
    @ConfigurationProperties(prefix = "myjsr303")
    public ConfigrationJSR303 configrationJSR303(){
        return new ConfigrationJSR303();
    }

}
