package com.cdut.controller;

import com.cdut.pojo.User;
import com.cdut.service.usercenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Configuration
@RestController
@Service
@RequestMapping("/api")
public class usercenterController {
    @Autowired(required = false)
    private usercenterService userService;

    @PostMapping(value = "/login", headers = "Accept=application/json")
    @ResponseBody
    public int Login(@RequestBody User user){
//        System.out.println(user.toString());
        int result = 0;
        List<User> user1 = userService.findByName(user.getUsername());
//        System.out.println(user1);
//        String password = MD5Utils.setDBPwd(user.getPassword(),salt);
        //二次加盐
        if(user.getUsername()==""||user.getPassword()==""){
            result = -1;
        }else if (user1 == null || user1.size() == 0){
            result = 0;
        }else if (user.getPassword().equals(user1.get(0).getPassword())){
            result = 1;
        }else {
            result = 0;
        }
        return result;
    }
}
