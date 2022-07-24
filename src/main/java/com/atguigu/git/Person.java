package com.atguigu.git;

import java.io.Serializable;

/**
 * @author 庄志康
 * @create 2022-07-24 22:29
 */
public class Person implements Serializable {

    private String id;
    private String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

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
}
