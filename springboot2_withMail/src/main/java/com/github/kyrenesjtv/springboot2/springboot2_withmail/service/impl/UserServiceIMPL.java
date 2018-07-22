package com.github.kyrenesjtv.springboot2.springboot2_withmail.service.impl;

import com.github.kyrenesjtv.springboot2.springboot2_withmail.DAO.UserDAO;
import com.github.kyrenesjtv.springboot2.springboot2_withmail.dto.PageBean;
import com.github.kyrenesjtv.springboot2.springboot2_withmail.po.User;
import com.github.kyrenesjtv.springboot2.springboot2_withmail.service.IUserService;
import com.github.pagehelper.PageHelper;
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

    @Override
    public PageBean<User> getAllListUsers(int pageNum, int pageSize) {
        //使用分页插件,核心代码就这一行
        PageHelper.startPage(pageNum, pageSize);
        List<User> allUsers = userDAO.getAllUsers();
        int allUsersCount = userDAO.getAllUsersCount();
        PageBean<User> pageData = new PageBean<>(pageNum, pageSize, allUsersCount);
        pageData.setItems(allUsers);
        // 获取
//       userDAO.getAllUsers();
        return pageData;
    }
}
