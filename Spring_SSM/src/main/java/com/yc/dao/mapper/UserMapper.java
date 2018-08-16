package com.yc.dao.mapper;

import com.yc.bean.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
    
    User selectOne(User user);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}