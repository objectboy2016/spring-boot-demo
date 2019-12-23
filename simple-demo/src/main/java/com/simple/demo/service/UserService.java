package com.simple.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
//框架会自动默认分别注入DataSourceTransactionManager或JpaTransactionManager
public class UserService {
    public void update() {


    }
}
