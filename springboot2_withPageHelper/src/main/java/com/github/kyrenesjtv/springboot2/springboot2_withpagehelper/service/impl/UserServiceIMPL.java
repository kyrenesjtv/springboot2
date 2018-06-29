package com.github.kyrenesjtv.springboot2.springboot2_withpagehelper.service.impl;

import com.github.kyrenesjtv.springboot2.springboot2_withpagehelper.DAO.UserDAO;
import com.github.kyrenesjtv.springboot2.springboot2_withpagehelper.po.User;
import com.github.kyrenesjtv.springboot2.springboot2_withpagehelper.service.IUserService;
import com.github.kyrenesjtv.springboot2.springboot2_withpagehelper.vo.PageBean;
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
        PageBean<User> pageData = new PageBean<>(pageNum, pageSize, allUsers.size());
        pageData.setItems(allUsers);
        // 获取
//       userDAO.getAllUsers();
        return pageData;
    }
}
