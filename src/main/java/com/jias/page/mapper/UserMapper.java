package com.jias.page.mapper;

import com.jias.page.entity.User;
import com.jias.page.entity.UserLoginLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    // 查询所有用户
    List<User> selectAllUser();

    // 注册用户
    int addUser(User user);

    // 用户登录
    Map<String, Object> userSignIn(User user);

    // 记录用户登录日志
    int addUserLoginLog(UserLoginLog userLoginLog);
}
