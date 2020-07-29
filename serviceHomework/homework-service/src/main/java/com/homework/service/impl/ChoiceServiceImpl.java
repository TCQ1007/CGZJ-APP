package com.homework.service.impl;

import com.cgzj.pojo.Choice;
import com.homework.mapper.ChoiceMapper;
import com.homework.service.ChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChoiceServiceImpl implements ChoiceService {
    @Autowired(required = false)
    private ChoiceMapper choiceMapper;
    @Override
    public List<Choice> findAllChoiceByHid(int hid) {
        return choiceMapper.findAllChoiceByHid(hid);
    }
}
