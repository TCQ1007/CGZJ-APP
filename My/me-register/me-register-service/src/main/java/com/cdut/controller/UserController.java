package com.cdut.controller;

import com.cdut.pojo.User;
import com.cdut.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("hello")
    public String hello(){
        return "hello springCloud+springBoot";
    }

    @RequestMapping(value="queryById/{id}",method = {RequestMethod.GET})
    @ResponseBody
    public User queryById(@PathVariable("id") int id) {
        User user = this.userService.queryById(id);
        return user;
    }

    @RequestMapping(value="queryAll",method = {RequestMethod.GET})
    @ResponseBody
    public List<User> queryAll(){
        return this.userService.findAll();
    }

    @RequestMapping(value="deleteUser/{id}",method = {RequestMethod.GET})
    public int deleteUser(@PathVariable("id") int id){
        return this.userService.deleteById(id);
    }
    //http://localhost:8088/user/queryUsers
    //返回的是json数据：List<User>
    @RequestMapping(value="queryUsers",method = {RequestMethod.GET})
    @ResponseBody
    public List<User> queryUsers(){
        return userService.queryUsers();
    }

    //restful风格的url：{id}
    //删除
    @RequestMapping(value="deleteById/{id}",method = {RequestMethod.GET})
    @ResponseBody
    public int deleteById(@PathVariable("id") int id){
        return userService.delUser(id);
    }
    //新增
    @RequestMapping(value="addUser/{username}/{password}/{sex}",method = {RequestMethod.GET})
    @ResponseBody
    public int addUser(@PathVariable("username") String username, @PathVariable("password") String password, @PathVariable("sex") String sex){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setSex(sex);
        System.out.println(user.toString());
        return userService.addUser(user);
//        return 1;
    }
    //修改
    @RequestMapping(value="updateUser/{id}/{username}/{password}/{sex}",method = {RequestMethod.GET})
    @ResponseBody
    public int updateUser(@PathVariable("id") int id, @PathVariable("username") String username, @PathVariable("password") String password, @PathVariable("sex") String sex){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setSex(sex);
        user.setId(id);
        System.out.println(user.toString());
        return userService.updateUser(user);
    }
}
