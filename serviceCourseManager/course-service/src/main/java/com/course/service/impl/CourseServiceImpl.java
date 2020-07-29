package com.course.service.impl;

import com.course.mapper.CourseMapper;
import com.course.pojo.Course;
import com.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Chen Xueni
 * Date: 2020/07/28
 * Description:
 * Version: V1.0（版本）
 */
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> queryCourses() {
        return courseMapper.findAll();
    }
}
