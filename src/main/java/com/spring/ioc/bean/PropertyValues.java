package com.spring.ioc.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majinliang on 16/9/27.
 */
public class PropertyValues {

    private final List<PropertyValue> propertyList = new ArrayList<PropertyValue>();

    public List getPropertyList() {
        return propertyList;
    }

    public PropertyValues(){};

    public void addPropertyValue(PropertyValue propertyValue){
        this.propertyList.add(propertyValue);
    }

    public List<PropertyValue> getPropertyValues(){
        return propertyList;
    }
}
