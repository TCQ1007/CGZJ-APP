package com.cgzj.controller;

import com.cgzj.pojo.Homework;
import com.cgzj.service.HomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/hc")
public class HomeworkController {
    @Autowired(required = false)
    private HomeworkService homeworkService;

    @RequestMapping(value = "/queryAllHomeworks", method = {RequestMethod.GET})
    public List<Homework> queryAllHomeworks(){
        return homeworkService.queryAllHomeworks();
    }
}
