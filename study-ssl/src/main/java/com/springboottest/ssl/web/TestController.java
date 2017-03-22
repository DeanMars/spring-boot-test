package com.springboottest.ssl.web;

import com.springboottest.ssl.config.Configration;
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


    @ResponseBody
    @RequestMapping("getServers")
    public List<String> getServers(){
        return configration.getServerList();
    }



}
