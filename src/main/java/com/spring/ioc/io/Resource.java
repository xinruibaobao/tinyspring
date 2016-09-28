package com.spring.ioc.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by majinliang on 16/9/28.
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
