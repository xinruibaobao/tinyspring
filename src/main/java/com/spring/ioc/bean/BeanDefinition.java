package com.spring.ioc.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by majinliang on 16/9/21.
 */
public class BeanDefinition {

    private Object bean;

    private Class beanClass;

    private String beanClassName;

    private PropertyValues propertyValues;

    public BeanDefinition(){};


    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public String getBeanClassName() {
        return beanClassName;
    }

    public void setBeanClassName(String beanClassName) {
        try{
            this.beanClass =  Class.forName(beanClassName);
        } catch(Exception e) {
            e.printStackTrace();
        }
        this.beanClassName = beanClassName;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }


}
