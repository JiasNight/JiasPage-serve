package com.jias.page.service;

import com.jias.page.entity.User;

import java.util.List;

public interface UserService {

    // 查询所有用户
    List<User> selectAllUser();

    // 注册用户
    Boolean addUser(User user);
}
