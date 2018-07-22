package com.github.kyrenesjtv.springboot2.springboot2_withmail.DAO;



import com.github.kyrenesjtv.springboot2.springboot2_withmail.po.User;

import java.util.List;

/**
 * @ProjectName: springboot2
 * @Author: wanglin
 * @CreateDate: 2018/6/21 18:21
 */
public interface UserDAO {
    /**
     * 返回所有的users
     *
     * @return
     */
    List<User> getAllUsers();

    /**
     * 通过id寻找User
     *
     * @param id
     * @return
     */
    User getUserByID(int id);

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    int updateUserByID(User user);

    /**
     * 通过id删除用户
     *
     * @param id
     * @return
     */
    int deleteUserByID(int id);

    /**
     * 创建用户
     *
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 获取所有用户的total
     *
     * @return
     */
    int getAllUsersCount();
}