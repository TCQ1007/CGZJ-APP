package com.cgzj.service;

import com.cgzj.pojo.Exam;

import java.util.List;

public interface ExamService {
    List<Exam> queryAllExams();
    List<Exam> queryAllExamsBySid(int sid);
    Exam getExamInfo(int eid);
}
