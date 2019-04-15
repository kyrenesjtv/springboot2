package com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement//事务注解
@ServletComponentScan//设置启动时spring能够扫描到我们自己编写的servlet和filter, 用于Druid监控
@ComponentScan//扫描controller
@MapperScan("com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.DAO")
public class Springboot2WithsecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2WithsecurityApplication.class, args);
    }

}
