package com.example.leidong.litepalsample.beans;

import org.litepal.annotation.Column;
import org.litepal.crud.DataSupport;

/**
 * Created by leido on 2017/5/5.
 */

public class Student extends DataSupport {
    @Column(unique = true)
    private int id;

    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
