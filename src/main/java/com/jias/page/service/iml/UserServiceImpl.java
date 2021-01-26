package com.jias.page.service.iml;

import com.jias.page.entity.User;
import com.jias.page.mapper.UserMapper;
import com.jias.page.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jias
 * @since 2020-11-18
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selectAllUser() {
        List<User> users = userMapper.selectAllUser();
        return users;
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public String userLogin(User user) {
        return userMapper.userLogin(user);
    }
}
