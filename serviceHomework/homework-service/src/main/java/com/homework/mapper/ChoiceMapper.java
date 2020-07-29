package com.homework.mapper;

import com.cgzj.pojo.Choice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChoiceMapper {
    List<Choice> findAllChoiceByHid(int hid);  //通过试卷id找到所有选择题
}
