package com.homework.mapper;

import com.cgzj.pojo.Judge;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JudgeMapper {
    List<Judge> findAllJudgeByHid(int hid);  //通过试卷id找到所有判断题
}
