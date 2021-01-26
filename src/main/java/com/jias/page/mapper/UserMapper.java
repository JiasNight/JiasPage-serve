package com.jias.page.mapper;

import com.jias.page.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    // 查询所有用户
    List<User> selectAllUser();

    // 注册用户
    int addUser(User user);

    // 用户登录
    String userLogin(User user);
}
