package com.spring.ioc.beanfactory;

import com.spring.ioc.bean.BeanDefinition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by majinliang on 16/9/22.
 */
public abstract class AbstractBeanFactory implements BeanFactory{

    Map<String,BeanDefinition> map = new ConcurrentHashMap<String, BeanDefinition>();

    private final List<String> beanDefinitionNames = new ArrayList<String>();

    public void registerBeanDedinition(String beanName, BeanDefinition beanDefinition) throws Exception{
        map.put(beanName,beanDefinition);
        beanDefinitionNames.add(beanName);
    }

    public Object getBean(String className) throws Exception {
        BeanDefinition beanDefinition = map.get(className);
        if (beanDefinition == null) {
            throw new IllegalArgumentException("No bean named " + className + " is defined");
        }
        Object bean = beanDefinition.getBean();
        if (bean == null) {
            bean = doCreateBean(beanDefinition);
        }
        return map.get(className).getBean();
    }

    public void preInstantiateSingletons() throws Exception {
        for (Iterator it = this.beanDefinitionNames.iterator(); it.hasNext();) {
            String beanName = (String) it.next();
            getBean(beanName);
        }
    }

    protected abstract Object doCreateBean(BeanDefinition beanDefinition) throws Exception;
}
