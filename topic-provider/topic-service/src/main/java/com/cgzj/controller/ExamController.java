package com.cgzj.controller;

import com.cgzj.pojo.Exam;
import com.cgzj.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/ec")
public class ExamController {
    @Autowired(required = false)
    private ExamService examService;

    @RequestMapping(value = "/queryAllExams", method = {RequestMethod.GET})
    public List<Exam> queryAllExams(){
        return examService.queryAllExams();
    }

    @RequestMapping(value = "/queryAllExamsBySid/{sid}", method = {RequestMethod.GET})
    public List<Exam> queryAllExamsBySid(@PathVariable("sid") int sid){
        return examService.queryAllExamsBySid(sid);
    }

    @RequestMapping(value = "/getExamInfo/{eid}", method = {RequestMethod.GET})
    public Exam getExamInfo(@PathVariable("eid") int eid){
        return examService.getExamInfo(eid);
    }




}
