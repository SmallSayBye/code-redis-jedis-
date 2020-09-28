package com.jedis.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.JedisPool;

@RestController
public class DemoController {


    @Autowired
    JedisPool jedisPool;


    @RequestMapping("/jedisTest")
    public void jedisTest(){
        System.out.println(jedisPool);
    }
}