package com.dongtian.mysql_module.service;

import com.dongtian.mysql_module.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    int addUser(User user);
    User selectByUserId(int user_id);
    int deleteUserById(int user_id);
}
