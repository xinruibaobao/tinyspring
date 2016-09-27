package com.spring.ioc.beanfactory;

import com.spring.ioc.bean.BeanDefinition;
import com.spring.ioc.bean.PropertyValue;
import com.spring.ioc.bean.PropertyValues;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by majinliang on 16/9/22.
 */
public class AutowireCapableBeanFactory extends  AbstractBeanFactory {

    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        Object object = null;
        try{
            PropertyValues propertyValues = beanDefinition.getPropertyValues();
            List<PropertyValue> propertyList = propertyValues.getPropertyList();
            Class beanClass = beanDefinition.getBeanClass();
            object = beanClass.newInstance();

            for(PropertyValue propertyValue:propertyList) {
                Field field = beanClass.getField(propertyValue.getName());
                field.set(object,propertyValue.getValue());

            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        return object;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition) throws Exception{
        return beanDefinition.getBeanClass().newInstance();
    }

    protected void applyPropertyValues(Object bean,BeanDefinition mbd) throws Exception{
        for(PropertyValue propertyValue:mbd.getPropertyValues().getPropertyValues()){
            Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());;
            declaredField.setAccessible(true);
            declaredField.set(bean, propertyValue.getValue());
        }
    }
}
