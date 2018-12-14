package com.baizhi.lpm.service;

import com.baizhi.lpm.entity.User;
import com.baizhi.lpm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<User> queryAll() {
        List<User> list = userMapper.selectAll();
        return list;
    }

    @Override
    public void insertUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void deleteUser(Integer id) {
    userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User queryById(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKey(user);
    }
}
