package com.spring.ioc.resource;

import com.spring.ioc.bean.BeanDefinition;
import com.spring.ioc.io.ResourceLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by majinliang on 16/9/28.
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private Map<String,BeanDefinition> registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(ResourceLoader resourceLoader) {
        this.registry = new HashMap<String,BeanDefinition>();
        this.resourceLoader = resourceLoader;
    }

    public Map<String, BeanDefinition> getRegistry() {
        return registry;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
