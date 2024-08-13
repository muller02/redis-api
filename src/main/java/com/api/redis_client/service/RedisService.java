package com.api.redis_client.service;

import com.api.redis_client.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
public class RedisService {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public void setKey(UserDTO userDTO) {

        String userId = userDTO.getUserId();
        redisTemplate.opsForValue().set(userId, userDTO, 24, TimeUnit.HOURS);
    }

    public boolean hasKey(String userId){
        return redisTemplate.hasKey(userId);
    }

    public  UserDTO getKey(String userId) {
        return (UserDTO)redisTemplate.opsForValue().get(userId);
    }
}