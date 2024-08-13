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
        String gender = userDTO.getGender();
        String birthYear = userDTO.getBirthYear();

        // userInfo -> Map
        Map<String, String> userInfoMap = new HashMap<String, String>();
        userInfoMap.put("gender", gender);
        userInfoMap.put("birthYear", birthYear);

        redisTemplate.opsForValue().set(userId, userInfoMap, 24, TimeUnit.HOURS);
    }

    public boolean hasKey(String userId){
        return redisTemplate.hasKey(userId);
    }

    public  Map<String, String>  getKey(String userId) {
        return (Map<String, String>)redisTemplate.opsForValue().get(userId);
    }
}