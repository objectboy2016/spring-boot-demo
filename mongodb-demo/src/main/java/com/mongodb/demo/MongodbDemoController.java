package com.mongodb.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1.1/mongodbdemo/")
public class MongodbDemoController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("save")
    public Object save() {
        User user = new User();
        user.setId(System.currentTimeMillis());
        user.setUsername("用户" + System.currentTimeMillis());
        user.setAge(11);
        User save = userRepository.save(user);
        return save;
    }


    @GetMapping("findAll")
    public List<User> findALL() {
        List<User> all = userRepository.findAll();
        return all;
    }
}