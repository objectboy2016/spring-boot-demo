package com.simple.demo.读取配置文件;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class EnvironmentConfig {
    @Autowired
    private Environment environment;

    public String getUserName() {
        return environment.getProperty("local.user.name");
    }
}
