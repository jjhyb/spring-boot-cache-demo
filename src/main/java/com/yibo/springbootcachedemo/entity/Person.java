package com.yibo.springbootcachedemo.entity;

import java.io.Serializable;

/**
 * @author: wb-hyb441488
 * @Date: 2019/1/10 17:03
 * @Description:
 */
public class Person implements Serializable {

    private String id;

    private String name;

    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
