package com.springboottest.config.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangchuqiang on 2017/3/9.
 */
@Component
@ConfigurationProperties(prefix = "mytest")
public class ConfigrationMyTest {

    private List<String> serverList=new ArrayList<String>();


    public List<String> getServerList() {
        return serverList;
    }

    public void setServerList(List<String> serverList) {
        this.serverList = serverList;
    }
}
