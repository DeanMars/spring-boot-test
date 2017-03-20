package com.springboottest.import1;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by Dean on 2017/3/20.
 *
 * 直接导入配置
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({MyConfig.class})
public @interface EnableMyConfig {



}
