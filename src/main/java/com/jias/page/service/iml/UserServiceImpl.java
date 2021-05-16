package com.jias.page.service.iml;

import com.jias.page.common.utils.BCryptPassword;
import com.jias.page.entity.User;
import com.jias.page.entity.UserLoginLog;
import com.jias.page.mapper.UserMapper;
import com.jias.page.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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

    @Autowired
    BCryptPassword bCryptPassword;

    @Override
    public List<User> selectAllUser() {
        List<User> users = userMapper.selectAllUser();
        return users;
    }

    @Override
    public int addUser(User user) {
        try {
            // 使用系统毫秒数作为主键id
            long uuid = System.currentTimeMillis();
            user.setUserId("user@id" + uuid);
            String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis());
            user.setCreateTime(time);
            user.setUpdateTime(time);
            // 用户密码加密存储
            BCryptPasswordEncoder passwordEncoder = bCryptPassword.passwordEncoder();
            user.setUserPassword(passwordEncoder.encode(user.getUserPassword()));
            int isAdd = userMapper.addUser(user);
            return isAdd;
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public Map<String, Object> userSignIn(User user) {
        Map<String, Object> userInfo = null;
        try {
            BCryptPasswordEncoder passwordEncoder = bCryptPassword.passwordEncoder();
            userInfo = userMapper.userSignIn(user);
            boolean isLogin = passwordEncoder.matches(user.getUserPassword(), (String) userInfo.get("user_password"));
            if (isLogin) {
                userInfo.put("isLogin", true);
            } else {
                userInfo.put("isLogin", false);
            }
            return userInfo;
        } catch (Exception e) {
            userInfo.put("isLogin", false);
            return userInfo;
        }
    }

    @Override
    public void addUserLoginLog(UserLoginLog userLoginLog) {
        userLoginLog.setLogId(UUID.randomUUID().toString());
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis());
        userLoginLog.setCreateTime(time);
        userLoginLog.setUpdateTime(time);
        userMapper.addUserLoginLog(userLoginLog);
    }
}
