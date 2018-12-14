package com.baizhi.lpm.service;

import com.baizhi.lpm.entity.User;

import java.util.List;

public interface UserService {
    public List<User> queryAll();
    public void insertUser(User user);
    public void deleteUser(Integer id);
    public User queryById(Integer id);
    public void updateUser(User user);
}
