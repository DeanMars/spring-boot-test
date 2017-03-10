package com.springboottest.domain.repository;

import com.springboottest.domain.entity.Test;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by zhangchuqig on 2017/3/7.
 */
public interface TestRepository extends MongoRepository<Test,Long> {


}
