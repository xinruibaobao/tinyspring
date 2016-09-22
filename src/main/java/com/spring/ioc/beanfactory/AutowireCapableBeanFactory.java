package com.spring.ioc.beanfactory;

import com.spring.ioc.bean.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by majinliang on 16/9/22.
 */
public class AutowireCapableBeanFactory implements BeanFactoryInterface {

    Map<String,BeanDefinition> beanMap = new HashMap();

    public Object getBean(String beanName) {
        return beanMap.get("beanName").getBean();
    }

    public void registerBean(String className) {



    }


}
