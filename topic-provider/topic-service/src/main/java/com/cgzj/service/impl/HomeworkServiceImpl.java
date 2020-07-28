package com.cgzj.service.impl;

import com.cgzj.mapper.HomeworkMapper;
import com.cgzj.pojo.Homework;
import com.cgzj.service.HomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeworkServiceImpl implements HomeworkService {
    @Autowired(required = false)
    private HomeworkMapper homeworkMapper;
    @Override
    public List<Homework> queryAllHomeworks() {
        return homeworkMapper.queryAllHomeworks();
    }
}
