package com.springboottest.selector;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by Dean on 2017/3/20.
 *
 * 依据条件选择配置
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({MySelector.class})
public @interface EnableMySelector {
    String value() default "";
}
