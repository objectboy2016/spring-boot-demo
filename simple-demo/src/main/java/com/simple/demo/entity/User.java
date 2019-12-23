package com.simple.demo.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class User {
    @NotBlank(message = "name不能为空")
    private String name;
    @Min(value = 1, message = "最小值为1")
    private int age;

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
