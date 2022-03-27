package com.Haven.service.impl;

import com.Haven.mapper.UserMapper;
import com.Haven.pojo.User;
import com.Haven.service.UserService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void deleteUserById(Integer userid) {
        userMapper.deleteUserById(userid);
    }

    @Override
    public void updateUserName(User user) {
        userMapper.updateUserName(user);
    }

    @Override
    public void updateUserPassword(User user) {
        userMapper.updateUserPassword(user);
    }

    @Override
    public List<User> selectAllUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public List<User> selectUserByName(String username) {
        return userMapper.selectUserByName(username);
    }

    @Override
    public List<User> selectUserById(Integer id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public User selectUserByIdAccurate(Integer id) {
        return userMapper.selectUserByIdAccurate(id);
    }
}
