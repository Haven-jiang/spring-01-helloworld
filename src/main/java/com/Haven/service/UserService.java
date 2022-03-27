package com.Haven.service;

import com.Haven.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    void insertUser(User user);
    void deleteUserById(Integer userid);
    void updateUserName(User user);
    void updateUserPassword(User user);
    List<User> selectAllUser();
    List<User> selectUserByName(String username);
    List<User> selectUserById(Integer id);
    User selectUserByIdAccurate(Integer id);
}
