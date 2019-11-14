package com.dongtian.mysql_module.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {
    private int user_id;
    private String username;
    private int age;

    public User() {
    }

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public User(int user_id, String username, int age) {
        this.user_id = user_id;
        this.username = username;
        this.age = age;
    }
}
