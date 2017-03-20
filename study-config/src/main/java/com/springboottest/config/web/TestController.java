package com.springboottest.config.web;

import com.springboottest.config.config.Configration;
import com.springboottest.config.config.Configration01;
import com.springboottest.config.config.Configration02;
import com.springboottest.config.config.ConfigrationMyTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhangchuqiang on 2017/3/9.
 */
@RestController
public class TestController {
    @Autowired
    private Configration configration;
    @Autowired
    private Configration01 configration01;
    @Autowired
    private Configration02.InnerConfigration innerConfigration;
    @Autowired
    private ConfigrationMyTest configrationMyTest;

    @ResponseBody
    @RequestMapping("getServers")
    public List<String> getServers(){
        return configration.getServerList();
    }

    @ResponseBody
    @RequestMapping("getServers01")
    public List<String> getServers01(){
        return configration01.getServerList();
    }

    @ResponseBody
    @RequestMapping("innerConfigration")
    public List<String> getInnerConfigrationServers01(){
        return innerConfigration.getServerList();
    }


    @ResponseBody
    @RequestMapping("mytest")
    public List<String> mytest(){
        return configrationMyTest.getServerList();
    }

}
