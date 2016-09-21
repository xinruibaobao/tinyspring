package com.spring.ioc.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by majinliang on 16/9/21.
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }
}
