package com.homework.service.impl;


import com.cgzj.pojo.Homework;
import com.homework.mapper.HomeworkMapper;
import com.homework.service.HomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeworkServiceImpl implements HomeworkService {
    @Autowired(required = false)
    private HomeworkMapper homeworkMapper;

    @Override
    public List<Homework> queryAllHomework(){
        return homeworkMapper.queryAllHomework();
    }

    @Override
    public List<Homework> queryAllHomeworkByCid(int cid) {
        return homeworkMapper.queryAllHomeworkByCid(cid);
    }

    @Override
    public Homework getHomeworkInfo(int hid) {
        return homeworkMapper.getHomeworkInfo(hid);
    }
}
