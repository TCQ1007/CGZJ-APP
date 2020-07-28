package mapper;

import com.pojo.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Chen Xueni
 * Date: 2020/07/28
 * Description:
 * Version: V1.0（版本）
 */
@Mapper
public interface CourseMapper {
//    List<Course> findByName(String username);
////    Course findById(int id);
////    int insert(Course course);
        List<Course> findAll();
}
