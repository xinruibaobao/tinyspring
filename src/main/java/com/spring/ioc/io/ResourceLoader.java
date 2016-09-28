package com.spring.ioc.io;

import java.net.URL;

/**
 * Created by majinliang on 16/9/28.
 */
public class ResourceLoader {

    public Resource getResource(String location) {
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }

}
