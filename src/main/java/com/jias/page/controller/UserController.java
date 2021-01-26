package com.jias.page.controller;

import com.jias.page.entity.User;
import com.jias.page.service.UserService;
import com.jias.page.tools.bcrypt.BCryptPassword;
import com.jias.page.tools.resultbody.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("addUser")
    public Result addUser(@RequestParam String userName, @RequestParam String userPasswd){
        long uuid = System.currentTimeMillis();
        User user = new User();
        user.setUserId(uuid);
        user.setUserName(userName);
        user.setUserPassword(bCryptPassword.encoder(userPasswd));
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
