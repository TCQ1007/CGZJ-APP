package com.homework.service;

import com.cgzj.pojo.Judge;

import java.util.List;

public interface JudgeService {
    List<Judge> findAllJudgeByHid(int hid);
}
