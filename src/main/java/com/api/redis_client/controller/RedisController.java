package com.api.redis_client.controller;

import com.api.redis_client.model.UserDTO;
import com.api.redis_client.service.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("redis")
@Slf4j
public class RedisController {

    @Autowired
    private RedisService service;

    @PostMapping("setKey")
    public Boolean setKey(@RequestBody UserDTO userDTO) {
        try{
            service.setKey(userDTO);
            return true;
        } catch (DataAccessException e){
//            log.error("setKey Error => {}", e.getMessage());
            return false;
        }
    }

    @GetMapping("hasKey")
    public Boolean hasKey(String userId) {
        return service.hasKey(userId);
    }

    @GetMapping("getKey")
    public Map<String, String> getKey(String userId) {
        return service.getKey(userId);
    }
}