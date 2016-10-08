package com.spring.ioc.bean;


/**
 * Created by majinliang on 16/9/27.
 */
public class PropertyValue {

    private String name;

    private Object value;

    public PropertyValue(String name,Object value) {

        this.name = name;
        this.value =value;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
