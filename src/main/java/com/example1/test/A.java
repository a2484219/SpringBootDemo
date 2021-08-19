package com.example1.test;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/11/29 0029.
 */
public class A implements Serializable {
    private String a;
    private String b;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
