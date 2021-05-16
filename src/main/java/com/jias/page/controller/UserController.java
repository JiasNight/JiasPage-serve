package com.jias.page.controller;

import com.jias.page.common.utils.IpUtil;
import com.jias.page.entity.User;
import com.jias.page.entity.UserLoginLog;
import com.jias.page.service.UserService;
import com.jias.page.common.utils.BCryptPassword;
import com.jias.page.common.resultbody.Result;
import com.jias.page.common.resultbody.ResultEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.sound.midi.Soundbank;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/signIn")
    public Result userSignIn(HttpServletRequest request, @RequestParam String userName, @RequestParam String userPassword){
        try {
            User user = new User();
            UserLoginLog userLoginLog = new UserLoginLog();
            user.setUserName(userName);
            user.setUserPassword(userPassword);
            Map<String, Object> userInfo = userService.userSignIn(user);
            userLoginLog.setUserName(userName);
            String ipAddress = IpUtil.getIpAddress(request);
            userLoginLog.setLoginIp(ipAddress);
            userLoginLog.setUserId((String) userInfo.get("user_id"));
            if((Boolean) userInfo.get("isLogin")) {
                userLoginLog.setLoginTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis()));
                userLoginLog.setLoginStatus(1);
                userService.addUserLoginLog(userLoginLog);
                return Result.success();
            } else {
                userLoginLog.setLoginStatus(0);
                userService.addUserLoginLog(userLoginLog);
                return Result.failure(ResultEnum.VERIFY_FAILURE);
            }
        } catch (Exception e) {
            return Result.failure(ResultEnum.UNKNOWN_ERROR);
        }
    }

    @PostMapping("addUser")
    public Result addUser(@RequestParam String userName, @RequestParam String userPassword){

        User user = new User();
        user.setUserName(userName);
        user.setUserPassword(userPassword);
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

    @GetMapping("hi")
    public Result test(){
        return Result.success("niha");
    }
}
