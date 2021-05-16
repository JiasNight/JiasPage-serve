package com.jias.page.service;

import com.jias.page.entity.User;
import com.jias.page.entity.UserLoginLog;

import java.util.List;
import java.util.Map;

public interface UserService {

    // 查询所有用户
    List<User> selectAllUser();

    // 注册用户
    int addUser(User user);

    // 用户登录
    Map<String, Object> userSignIn(User user);

    //记录用户登录日志
    void addUserLoginLog(UserLoginLog userLoginLog);
}
