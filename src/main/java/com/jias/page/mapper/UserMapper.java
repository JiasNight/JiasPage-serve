package com.jias.page.mapper;

import com.jias.page.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> selectAllUser();

    int addUser(User user);
}
