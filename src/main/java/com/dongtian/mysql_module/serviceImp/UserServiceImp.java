package com.dongtian.mysql_module.serviceImp;


import com.dongtian.mysql_module.dao.UserMapper;
import com.dongtian.mysql_module.entity.User;
import com.dongtian.mysql_module.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public User selectByUserId(int user_id) {
        return userMapper.selectByUserId(user_id);
    }

    @Override
    public int deleteUserById(int user_id) {
        return userMapper.deleteUserById(user_id);
    }
}
