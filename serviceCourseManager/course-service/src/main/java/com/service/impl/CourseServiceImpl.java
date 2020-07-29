package service.impl;

import mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Chen Xueni
 * Date: 2020/07/28
 * Description:
 * Version: V1.0（版本）
 */
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> queryUsers() {
        return courseMapper.findAll();
    }
}
