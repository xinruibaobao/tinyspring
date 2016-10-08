package com.spring.ioc.beanfactory;

import com.spring.ioc.bean.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by majinliang on 16/9/21.
 */
public interface BeanFactory {

    public Object getBean(String className) throws Exception;

}
