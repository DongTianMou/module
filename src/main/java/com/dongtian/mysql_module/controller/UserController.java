package com.dongtian.mysql_module.controller;


import com.dongtian.mysql_module.entity.User;
import com.dongtian.mysql_module.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    /*
    int addUser(User user);
    User selectByUserId(int user_id);
    int deleteUserById(int user_id);
     */
    @Autowired
    UserService userService;

    @RequestMapping("/add")
    public String addUser(){
        User user = new User("王五",20);
        userService.addUser(user);
        return "success";
    }
}
