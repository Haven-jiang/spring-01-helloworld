package com.Haven.mapper;

import com.Haven.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper //表示是一个mybatis的mapper类
@Repository //dao类
public interface UserMapper {
    void insertUser(User user);
    void deleteUserById(@Param("userid") Integer userid);
    void updateUserName(User user);
    void updateUserPassword(User user);
    List<User> selectAllUser();
    List<User> selectUserByName(@Param("username") String username);
    List<User> selectUserById(@Param("userid") Integer id);
    User selectUserByIdAccurate(@Param("userid") Integer id);
}
