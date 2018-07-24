package com.conquer.shardingjdbcdemo.service;

import com.conquer.shardingjdbcdemo.entity.UserEntity;
import com.conquer.shardingjdbcdemo.mapper.User1Mapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/17 14:09
 */
@Slf4j
@Service
public class User1Service {
    @Autowired
    private User1Mapper user1Mapper;

    public List<UserEntity> getUsers() {
        List<UserEntity> users = user1Mapper.getAll();
        return users;
    }

    public void updateTransactional(UserEntity user) {
        try {
//            user1Mapper.insert(user);
            user1Mapper.insert(user);
            log.error(String.valueOf(user));
        } catch (Exception e) {
            log.error("find exception!");
            throw e;
        }
    }
}
