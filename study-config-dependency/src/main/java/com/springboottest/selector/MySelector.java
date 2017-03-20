package com.springboottest.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * Created by Dean on 2017/3/20.
 */
public class MySelector implements ImportSelector{
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        Map<String, Object> map=annotationMetadata.getAnnotationAttributes(EnableMySelector.class.getName());
        String value=map.get("value").toString();
        if(SelectMode.MODE_TEST.equals(value)){
            return new String[]{TestConfig.class.getName()};
        }else if(SelectMode.MODE_PRODUCT.equals(value)){
            return new String[]{ProductConfig.class.getName()};
        }
        return new String[0];
    }
}
