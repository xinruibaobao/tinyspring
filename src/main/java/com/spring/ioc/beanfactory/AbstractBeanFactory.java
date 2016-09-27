package com.spring.ioc.beanfactory;

import com.spring.ioc.bean.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by majinliang on 16/9/22.
 */
public abstract class AbstractBeanFactory implements BeanFactory{

    Map<String,BeanDefinition> map = new ConcurrentHashMap<String, BeanDefinition>();

    public void registerBeanDedinition(String beanName, BeanDefinition beanDefinition) throws Exception{
        Object object = doCreateBean(beanDefinition);
        beanDefinition.setBean(object);
        map.put(beanName,beanDefinition);
    }

    public Object getBean(String className) {
        return map.get(className).getBean();
    }

    protected abstract Object doCreateBean(BeanDefinition beanDefinition) throws Exception;
}
