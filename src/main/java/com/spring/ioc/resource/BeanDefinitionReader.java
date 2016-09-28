package com.spring.ioc.resource;

/**
 * Created by majinliang on 16/9/28.
 */
public interface  BeanDefinitionReader {

   void loadBeanDefinitions(String location) throws Exception;
}
