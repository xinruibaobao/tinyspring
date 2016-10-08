package com.spring.ioc.application;

import com.spring.ioc.bean.BeanDefinition;
import com.spring.ioc.beanfactory.AbstractBeanFactory;
import com.spring.ioc.beanfactory.AutowireCapableBeanFactory;
import com.spring.ioc.io.ResourceLoader;
import com.spring.ioc.resource.AbstractBeanDefinitionReader;
import com.spring.ioc.resource.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * Created by majinliang on 16/10/8.
 */
public class ClassPathXmlApplicatioinContext extends AbstractApplicationContext {


    private String configLocation;

    public ClassPathXmlApplicatioinContext(String configLocation) throws Exception {
        this(configLocation, new AutowireCapableBeanFactory());
    }

    public ClassPathXmlApplicatioinContext(String configLocation, AbstractBeanFactory beanFactory) throws Exception {
        super(beanFactory);
        this.configLocation = configLocation;
        refresh();
    }

    @Override
    public void refresh() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions(configLocation);
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDedinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }
    }

}
