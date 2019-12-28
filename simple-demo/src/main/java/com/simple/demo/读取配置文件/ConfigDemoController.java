package com.simple.demo.读取配置文件;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/configDemo")
public class ConfigDemoController {
    @Autowired
    private EnvConfig envConfig;
    @Value("${local.user.name}")
    private String userName;
    @Autowired
    private ConfigurationPropertiesConfig ConfigurationPropertiesConfig;

    /**
     * Value 获取配置值
     *
     * @return
     */
    @GetMapping("/username")
    public String getUserName_Value() {
        return userName;
    }

    /**
     * Environment 获取配置值
     *
     * @return
     */
    @GetMapping("/username_env")
    public String getUserName_Environment() {
        return envConfig.getUserName();
    }

    /**
     * configurationProperties 获取配置值
     *
     * @return
     */
    @GetMapping("/server_configurationProperties")
    public String getServer_ConfigurationProperties() {
        String address = ConfigurationPropertiesConfig.getAddress();
        return address;
    }
}
