package com.github.kyrenesjtv.springboot2.springboot2_newproject.controller;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springboot2
 * @Author: wanglin
 * @CreateDate: 2018/6/26 18:27
 */
@RestController
public class TestController {
    @RequestMapping("/index")
    public String index(){
        return "hello world";
    }
}
