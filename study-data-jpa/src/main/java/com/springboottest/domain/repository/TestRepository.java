package com.springboottest.domain.repository;

import com.springboottest.domain.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhangchuqig on 2017/3/7.
 */
public interface TestRepository extends JpaRepository<Test,Long>{


}
