package com.conquer.shardingjdbcdemo.mapper;

import com.conquer.shardingjdbcdemo.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/17 14:12
 */
//@Mapper
public interface User1Mapper {
    List<UserEntity> getAll();

    void insert(UserEntity user);
}
