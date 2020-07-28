package com.homework.service;

import com.cgzj.pojo.Homework;

import java.util.List;

public interface HomeworkService {
    List<Homework> queryAllHomework();
    List<Homework> queryAllHomeworkByCid(int cid);
    Homework getHomeworkInfo(int hid);
}
