package com.cdut.service.impl;

import com.cdut.mapper.usercenterMapper;
import com.cdut.pojo.User;
import com.cdut.service.usercenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class usercenterServiceImpl implements usercenterService {
    @Autowired(required = false)
    private usercenterMapper usercenterMapper;

    @Override
    public List<User> findByName(String username) {
        return usercenterMapper.findByName(username);
    }
}
