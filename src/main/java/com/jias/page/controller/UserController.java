package com.jias.page.controller;

import com.jias.page.entity.User;
import com.jias.page.tools.resultbody.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    public Result addUser(@RequestBody User user){
        return null;
    }
}
