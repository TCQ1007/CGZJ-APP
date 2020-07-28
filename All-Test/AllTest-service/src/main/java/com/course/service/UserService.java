package com.course.service;

import com.course.pojo.User;

import java.util.List;

public interface UserService {

    public User queryById(int id);

    public List<User> findAll();


    public int deleteById(int id);
    public List<User> queryUsers();
    public User findById(int id);
    public List<User> findByName(String username);
    public int delUser(int id);
    public int addUser(User user);
    public int updateUser(User user);
    public int validateLogin(User user);
}
