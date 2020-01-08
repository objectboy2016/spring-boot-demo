package com.redis.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.1/")
public class RedisDemoController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void add() {

    }
}
