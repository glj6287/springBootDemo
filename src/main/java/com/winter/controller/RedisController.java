package com.winter.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.winter.service.redis.RedisService;

@RestController
public class RedisController {


    @Autowired
    private RedisService<?> redisService ;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public void demoTest(){
        redisService.set("1","value22222");
    }

}