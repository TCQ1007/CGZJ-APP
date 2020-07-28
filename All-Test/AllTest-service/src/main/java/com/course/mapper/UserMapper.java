package com.course.mapper;


import com.course.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {
    User findById(int id);
    List<User> findAll();
    int deleteById(int id);
    List<User> findByName(String username);

    int delUser(int id);
    int addUser(User user);
    int updateUser(User user);
}