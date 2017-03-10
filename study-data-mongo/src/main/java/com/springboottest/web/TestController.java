package com.springboottest.web;

import com.springboottest.domain.entity.Test;
import com.springboottest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangchuqiang on 2017/3/8.
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("test")
    @ResponseBody
    public Iterable getTest(){
        Iterable<Test> list= testService.getTests();
        return list;
    }

    @RequestMapping("insert")
    @ResponseBody
    public Test insert(){
        Test test= testService.insert();
        return test;
    }

}
