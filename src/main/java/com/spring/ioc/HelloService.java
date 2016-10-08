package com.spring.ioc;

/**
 * Created by majinliang on 16/9/22.
 */
public class HelloService {

    public String mykey;

    private RefService refService;

    public RefService getRefService() {
        return refService;
    }

    public void setRefService(RefService refService) {
        this.refService = refService;
    }

    public void sayHello() {
        System.out.println(mykey);
    }

    public String getMykey() {
        return mykey;
    }

    public void setMykey(String mykey) {
        this.mykey = mykey;
    }
}
