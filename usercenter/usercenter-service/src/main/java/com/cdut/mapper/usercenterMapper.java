package com.cdut.mapper;

import com.cdut.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface usercenterMapper {
    public List<User> findByName(String username);
}
