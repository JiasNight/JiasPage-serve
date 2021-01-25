package com.jias.page.controller;

import com.jias.page.entity.User;
import com.jias.page.service.UserService;
import com.jias.page.tools.resultbody.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("addUser")
    public Result addUser(@RequestParam String userName, @RequestParam String userPasswd){
        User user = new User();
        user.setUserName(userName);
        user.setUserPassword(userPasswd);
        Boolean aBoolean = userService.addUser(user);
        if(aBoolean) {
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
