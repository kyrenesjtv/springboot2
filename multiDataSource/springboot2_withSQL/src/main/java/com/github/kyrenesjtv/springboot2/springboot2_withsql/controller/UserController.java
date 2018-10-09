package com.github.kyrenesjtv.springboot2.springboot2_withsql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ProjectName: springboot2
 * @Author: wanglin
 * @CreateDate: 2018/6/21 18:21
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

//    @Autowired
//    private UserServiceIMPL userServiceIMPL;
//
//
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public List<User> getAllUsers() {
//        return userServiceIMPL.getAllUsers();
//    }
//
//    @RequestMapping(value = "/carmon/{id}", method = RequestMethod.GET)
//    public User getCarmonUserByID(@PathVariable int id) {
//        return userServiceIMPL.getCarmonUserByID(id) ;
//    }
//
//    @RequestMapping(value = "/gwyc/{id}", method = RequestMethod.GET)
//    public User getGwycUserByID(@PathVariable int id) {
//        return userServiceIMPL.getGwycUserByID(id) ;
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//    public int updateUserByID(@PathVariable int id, @ModelAttribute User user) {
//        User user1 = userServiceIMPL.getCarmonUserByID(id);
//        if (user != null) {
//            user1.setAge(user.getAge());
//            user1.setName(user.getName());
//        }
//        return userServiceIMPL.updateUserByID(user1);
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//    public int deleteUserByID(@PathVariable int id) {
//        return userServiceIMPL.deleteUserByID(id);
//    }
//
//    @RequestMapping(value = "/", method = RequestMethod.POST)
//    public int insertUser(@ModelAttribute User user) {
//        int i = userServiceIMPL.insertUser(user);
//        System.out.println("================    "+ user.getId() +" =====================");
//        System.out.println("================    "+ i +" =====================");
//        return i;
//    }
}