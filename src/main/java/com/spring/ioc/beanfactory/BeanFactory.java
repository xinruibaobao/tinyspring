package com.spring.ioc.beanfactory;

import com.spring.ioc.bean.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by majinliang on 16/9/21.
 */
public interface BeanFactory {

    public void registerBeanDedinition(String beanName,BeanDefinition beanDefinition) throws Exception;

    public Object getBean(String className);

}
