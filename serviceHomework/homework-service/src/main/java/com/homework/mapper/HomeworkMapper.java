package com.homework.mapper;

import com.cgzj.pojo.Homework;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HomeworkMapper {
    List<Homework> queryAllHomework();
    List<Homework> queryAllHomeworkByCid(int cid); //通过课程id查找所有的作业（考试）
    Homework getHomeworkInfo(int hid); //通过作业（考试）id查看相关信息
//    Exam findById(int id);
//    Exam findByName(String name);
//    int deleteById(int id);
//    int insert(Exam exam);
//    int update(Exam exam);

}
