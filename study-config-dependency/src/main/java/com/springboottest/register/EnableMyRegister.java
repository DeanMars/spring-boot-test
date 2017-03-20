package com.springboottest.register;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by Dean on 2017/3/20.
 *
 * 动态注册bean
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({MyRegister.class})
public @interface EnableMyRegister {

    String name() default "";
}
