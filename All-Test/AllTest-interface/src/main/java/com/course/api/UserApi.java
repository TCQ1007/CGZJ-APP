package com.course.api;

import com.course.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("user")
public interface UserApi {
    @GetMapping("hello")
    public String hello();

    @RequestMapping(value="queryAll", method = {RequestMethod.GET})
    @ResponseBody
    public List<User> queryAll();
}
