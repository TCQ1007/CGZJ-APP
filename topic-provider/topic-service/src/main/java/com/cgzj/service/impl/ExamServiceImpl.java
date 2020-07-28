package com.cgzj.service.impl;

import com.cgzj.pojo.Exam;
import com.cgzj.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import com.cgzj.mapper.ExamMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamServiceImpl implements ExamService {
    @Autowired(required = false)
    private ExamMapper examMapper;

    @Override
    public List<Exam> queryAllExams() {
        return examMapper.queryAllExams();
    }

    @Override
    public List<Exam> queryAllExamsBySid(int sid) {
        return examMapper.queryAllExamsBySid(sid);
    }

    @Override
    public Exam getExamInfo(int eid) {
        return examMapper.getExamInfo(eid);
    }
}
