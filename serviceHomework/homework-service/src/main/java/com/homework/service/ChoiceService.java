package com.homework.service;

import com.cgzj.pojo.Choice;

import java.util.List;

public interface ChoiceService {
    List<Choice> findAllChoiceByHid(int hid);
}
