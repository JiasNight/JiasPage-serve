package com.jias.page.controller;

import com.jias.page.entity.User;
import com.jias.page.service.UserService;
import com.jias.page.tools.bcrypt.BCryptPassword;
import com.jias.page.tools.resultbody.Result;
import com.jias.page.tools.resultbody.ResultEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    BCryptPassword bCryptPassword;

    @PostMapping("login")
    public Result userLogin(@RequestParam String userName, @RequestParam String userPasswd){
        User user = new User();
        user.setUserName(userName);
        BCryptPasswordEncoder passwordEncoder = bCryptPassword.passwordEncoder();
        String userPassword = userService.userLogin(user);
        boolean isLogin = passwordEncoder.matches(userPasswd, userPassword);
        if(isLogin) {
            return Result.success();
        } else {
            return Result.failure(ResultEnum.VERIFY_FAILURE);
        }
    }

    @PostMapping("addUser")
    public Result addUser(@RequestParam String userName, @RequestParam String userPasswd){
        long uuid = System.currentTimeMillis();
        User user = new User();
        user.setUserId(uuid);
        user.setUserName(userName);
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis());
        user.setCreateTime(time);
        user.setUpdateTime(time);
        BCryptPasswordEncoder passwordEncoder = bCryptPassword.passwordEncoder();
        user.setUserPassword(passwordEncoder.encode(userPasswd));
        int anInt = userService.addUser(user);
        if(anInt != 0) {
            return Result.success();
        } else {
            return Result.failure();
        }
    }

    @GetMapping("allUser")
    public Result allUser() {
        List<User> users = userService.selectAllUser();
        if(users.isEmpty()) {
            return Result.failure();
        } else {
            return Result.success(users);
        }
    }
}
