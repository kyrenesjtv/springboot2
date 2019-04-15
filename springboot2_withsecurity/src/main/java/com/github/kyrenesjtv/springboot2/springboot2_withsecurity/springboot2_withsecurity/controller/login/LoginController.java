package com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: springboot2
 * @Author: wanglin
 * @CreateDate: 2019/4/15 18:16
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public String login(){
        return "/login";
    }

    @RequestMapping(value = "/init")
    public String init(){
        return "/init";
    }
}
