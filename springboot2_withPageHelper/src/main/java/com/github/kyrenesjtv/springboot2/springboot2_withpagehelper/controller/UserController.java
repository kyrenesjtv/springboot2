package com.github.kyrenesjtv.springboot2.springboot2_withpagehelper.controller;

import com.github.kyrenesjtv.springboot2.springboot2_withpagehelper.po.User;
import com.github.kyrenesjtv.springboot2.springboot2_withpagehelper.service.impl.UserServiceIMPL;
import com.github.kyrenesjtv.springboot2.springboot2_withpagehelper.vo.PageBean;
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

    @Autowired
    private UserServiceIMPL userServiceIMPL;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userServiceIMPL.getAllUsers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserByID(@PathVariable int id) {
        return userServiceIMPL.getUserByID(id) ;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public int updateUserByID(@PathVariable int id, @ModelAttribute User user) {
        User user1 = userServiceIMPL.getUserByID(id);
        if (user != null) {
            user1.setAge(user.getAge());
            user1.setName(user.getName());
        }
        return userServiceIMPL.updateUserByID(user1);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public int deleteUserByID(@PathVariable int id) {
        return userServiceIMPL.deleteUserByID(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public int insertUser(@ModelAttribute User user) {
        int i = userServiceIMPL.insertUser(user);
        System.out.println("================    "+ user.getId() +" =====================");
        System.out.println("================    "+ i +" =====================");
        return i;
    }
    @RequestMapping(value = "/listUser", method = RequestMethod.GET)
    public List<User> getAllListUsers(int pageNum, int pageSize) {
        PageBean<User> allListUsers = userServiceIMPL.getAllListUsers(pageNum, pageSize);
        return allListUsers.getItems();
    }

}