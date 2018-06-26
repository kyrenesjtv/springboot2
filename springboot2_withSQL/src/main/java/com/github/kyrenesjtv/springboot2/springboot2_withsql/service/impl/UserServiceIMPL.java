package com.github.kyrenesjtv.springboot2.springboot2_withsql.service.impl;

import com.github.kyrenesjtv.springboot2.springboot2_withsql.DAO.UserDAO;
import com.github.kyrenesjtv.springboot2.springboot2_withsql.po.User;
import com.github.kyrenesjtv.springboot2.springboot2_withsql.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: springboot2
 * @Author: wanglin
 * @CreateDate: 2018/6/21 18:21
 */
@Service
public class UserServiceIMPL implements IUserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public User getUserByID(int id) {
        return userDAO.getUserByID(id);
    }

    @Override
    public int updateUserByID(User user) {
        return userDAO.updateUserByID(user);
    }

    @Override
    public int deleteUserByID(int id) {
        return userDAO.deleteUserByID(id);
    }

    @Override
    public int insertUser(User user) {
        return userDAO.insertUser(user);
    }
}
