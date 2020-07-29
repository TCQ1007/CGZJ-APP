package com.homework.service.impl;

import com.cgzj.pojo.Judge;
import com.homework.mapper.JudgeMapper;
import com.homework.service.JudgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JudgeServiceImpl implements JudgeService {
    @Autowired(required = false)
    private JudgeMapper judgeMapper;
    @Override
    public List<Judge> findAllJudgeByHid(int hid) {
        return judgeMapper.findAllJudgeByHid(hid);
    }
}
