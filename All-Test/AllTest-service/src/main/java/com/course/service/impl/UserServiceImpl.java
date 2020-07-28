package com.course.service.impl;


import com.course.mapper.UserMapper;
import com.course.pojo.User;
import com.course.service.UserService;
import com.course.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    public User queryById(int id) {
        return userMapper.findById(id);
    }

    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Transactional
    public int deleteById(int id) {
        return userMapper.deleteById(id);
    }

    @Override
    public List<User> queryUsers() {
        return userMapper.findAll();
    }

    @Override
    public List<User> findByName(String username) {
        return userMapper.findByName(username);
    }
    public int validateLogin(User user){
        List<User> userList = userMapper.findByName(user.getUsername());
        //逻辑还要优化：0，1，2
        if(userList.size()>0){
            for(User item:userList){
                if(item.getPassword().equals(user.getPassword())){
                    return Constants.LOGIN_SUCCESS;
                }
            }
            return Constants.LOGIN_ERROR_PASSWORD;
        }else{
            return Constants.LOGIN_ERROR_USERNAME;
        }

    }
    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }
    @Override
    public int delUser(int id){
        return userMapper.delUser(id);
    }
    @Override
    public int addUser(User user){return userMapper.addUser(user);}
    @Override
    public int updateUser(User user){return userMapper.updateUser(user);}

}
