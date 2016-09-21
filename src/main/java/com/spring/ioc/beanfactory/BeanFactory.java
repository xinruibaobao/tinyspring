package com.spring.ioc.beanfactory;

import com.spring.ioc.bean.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by majinliang on 16/9/21.
 */
public class BeanFactory {

    Map<String,BeanDefinition> map = new HashMap();

    public void registerBeanDedinition(String beanName,BeanDefinition beanDefinition) {
        map.put(beanName,beanDefinition);
    }

    public Object getBean(String className) {
        return map.get(className).getBean();
    }

}
