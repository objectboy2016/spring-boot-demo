package com.simple.demo.参数验证;


import com.simple.demo.entity.User;
import com.simple.demo.entity.UserInfo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@RestController
@Validated
public class VerificationDemoController {

    @GetMapping("/verificationDemo/index")
    public String getIndex(){
        return "hello world";
    }

    /**
     * 实体参数验证
     * @param user
     * @return
     */
    @GetMapping("/verificationDemo/user")
    public  String getUser(@Validated User user, @Validated UserInfo userInfo) {
        return "实体验证";
    }

    /**
     * 普通参数验证
     * @param user
     * @return
     */
    @GetMapping("/verificationDemo/ordinaryParameters")
    public String ordinaryParameters( @NotBlank(message = "name不能为空") String name, @Min(value = 1,message = "age最小为1") String age){
        return "普通参数验证";
    }
}
