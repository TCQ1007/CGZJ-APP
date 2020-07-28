package com.cgzj.mapper;

import com.cgzj.pojo.Homework;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface HomeworkMapper {
    List<Homework> queryAllHomeworks();
}
