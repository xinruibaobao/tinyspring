package com.spring.ioc.bean;


/**
 * Created by majinliang on 16/9/27.
 */
public class PropertyValue {

    private String name;

    private String value;

    public PropertyValue(String name,String value) {

        this.name = name;
        this.value =value;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
