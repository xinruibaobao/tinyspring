package com.spring.ioc.application;

import com.spring.ioc.beanfactory.AbstractBeanFactory;

/**
 * Created by majinliang on 16/10/8.
 */
public abstract class AbstractApplicationContext implements ApplicationContext {

    protected AbstractBeanFactory beanFactory;

    public AbstractApplicationContext(AbstractBeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public void refresh() throws Exception{
    }

    public Object getBean(String name) throws Exception {
        return beanFactory.getBean(name);
    }
}
