package com.springboottest.register;

import com.springboottest.import1.TestPojo;
import com.springboottest.selector.EnableMySelector;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * Created by Dean on 2017/3/20.
 */
public class MyRegister implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {

        Map<String, Object> map=annotationMetadata.getAnnotationAttributes(EnableMyRegister.class.getName());
        String value=map.get("name").toString();

        BeanDefinitionBuilder builder=BeanDefinitionBuilder.genericBeanDefinition(TestPojo.class);
        builder.addPropertyValue("name",value);

        beanDefinitionRegistry.registerBeanDefinition(TestPojo.class.getName(),builder.getBeanDefinition());

    }


}
