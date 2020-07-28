package com.cdut.service;

import com.cdut.pojo.User;

import java.util.List;

public interface usercenterService {
    public List<User> findByName(String username);
}
