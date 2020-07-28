package com.cgzj.mapper;

import com.cgzj.pojo.Exam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExamMapper {
    List<Exam> queryAllExams();
    List<Exam> queryAllExamsBySid(int sid);
    Exam getExamInfo(int eid);
//    Exam findById(int id);
//    Exam findByName(String name);
//    int deleteById(int id);
//    int insert(Exam exam);
//    int update(Exam exam);

}
