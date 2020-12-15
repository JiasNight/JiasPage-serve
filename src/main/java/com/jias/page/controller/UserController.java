package com.jias.page.controller;

import com.jias.page.entity.User;
import com.jias.page.service.UserService;
import com.jias.page.tools.resultbody.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

//    @PostMapping("addUser")
    @GetMapping("addUser")
    public Result addUser(@RequestBody User user){
        if(1 == 1){
            return Result.success();
        }else{
            return Result.failure();
        }
    }

    @GetMapping("allUser")
    public Result allUser() {
        return Result.success(userService.selectAllUser());
    }
}
