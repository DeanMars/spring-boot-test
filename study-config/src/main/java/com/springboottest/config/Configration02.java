package com.springboottest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangchuqiang on 2017/3/9.
 *
 *
 * 去除@Configuration会报错
 */
@Configuration
public class Configration02 {


    @Bean
    @ConfigurationProperties(prefix = "my")
    public InnerConfigration innerConfigration(){
        return new InnerConfigration();
    }



    public class InnerConfigration{

        private List<String> serverList=new ArrayList<String>();


        public List<String> getServerList() {
            return serverList;
        }

        public void setServerList(List<String> serverList) {
            this.serverList = serverList;
        }

    }


}
