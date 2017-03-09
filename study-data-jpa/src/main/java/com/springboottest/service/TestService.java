package com.springboottest.service;

import com.springboottest.domain.entity.Test;
import com.springboottest.domain.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangchuqiang on 2017/3/8.
 */
@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public Iterable<Test> getTests(){
        Iterable<Test> list= testRepository.findAll();
        return list;
    }


}
