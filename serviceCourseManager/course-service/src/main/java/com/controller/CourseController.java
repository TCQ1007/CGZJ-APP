package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Chen Xueni
 * Date: 2020/07/28
 * Description:
 * Version: V1.0（版本）
 */
@RestController
@RequestMapping("course")
//测试11
public class CourseController {
        @Autowired(required = false)
        private CourseService courseService;

        //http://localhost:8088/user/queryUsers
        //返回的是json数据：List<User>

        @RequestMapping(value = "queryCourses", method = {RequestMethod.GET})
        @ResponseBody
        public List<Course> queryUsers() {
            return courseService.queryUsers();

    }
}
