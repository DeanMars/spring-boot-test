package com.springboottest.web;

import com.springboottest.config.Configration;
import com.springboottest.config.Configration01;
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



}
