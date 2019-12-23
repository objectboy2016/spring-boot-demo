package com.simple.demo.entity;

import javax.validation.constraints.NotBlank;

public class UserInfo {
    @NotBlank(message = "地址不能为空")
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
