package com.dongtian.mysql_module.dao;

import com.dongtian.mysql_module.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper {
    String TABLE_NAME = "user";
    String INSET_FIELDS = " username, age ";
    String SELECT_FIELDS = " user_id, name, age";

    @Insert({"insert into ", TABLE_NAME, "(", INSET_FIELDS,
            ") values (#{username},#{age})"})
    int addUser(User user);

    User selectByUserId(int user_id);
    int deleteUserById(int user_id);

}
