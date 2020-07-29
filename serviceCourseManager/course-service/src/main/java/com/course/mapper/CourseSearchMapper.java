package com.course.mapper;

import com.course.domain.Course;

import java.util.List;

/*
 *@author by java开发-曾
 *2020/7/29 9:59
 *文件说明：用来做课程搜索的接口文件
 */
public interface CourseSearchMapper {

    //通过类型查询课程
    List<Course> getCourseByType(String type);

    //查询选课人数为前四的做推荐课程
    List<Course> getCourseByStudentCount();

    //通过模糊查询，查课程名来获取课程搜索的列表
    List<Course> getCourseByName(String name);

}
