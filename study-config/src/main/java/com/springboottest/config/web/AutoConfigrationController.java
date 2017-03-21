package com.springboottest.config.web;

import com.springboottest.autoconfigration.TestBean;
import com.springboottest.import1.TestPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangchuqiang on 2017/3/9.
 */
@RestController
public class AutoConfigrationController {
    @Autowired
    private TestBean testBean;

    @ResponseBody
    @RequestMapping("autoConfig")
    public Object getServers(){
        return testBean;
    }



}
