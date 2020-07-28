package com.homework.controller;

import com.cgzj.pojo.Homework;
import com.homework.service.HomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/hc")
public class HomeworkController {
    @Autowired(required = false)
    private HomeworkService homeworkService;

    @RequestMapping(value = "/queryAllHomework", method = {RequestMethod.GET})
    public List<Homework> queryAllHomework(){
        return homeworkService.queryAllHomework();
    }

    @RequestMapping(value = "/queryAllHomeworkByCid/{cid}", method = {RequestMethod.GET})
    public List<Homework> queryAllHomeworkByCid(@PathVariable("cid") int cid){
        return homeworkService.queryAllHomeworkByCid(cid);
    }

    @RequestMapping(value = "/getHomeworkInfo/{hid}", method = {RequestMethod.GET})
    public Homework getHomeworkInfo(@PathVariable("hid") int hid){
        return homeworkService.getHomeworkInfo(hid);
    }




}
