package com.jedis.code.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;


@Configuration
public class JedisConfig {

    @Value("${spring.redis.host}")
    private String redisHost;

    @Value("${spring.redis.port}")
    private Integer redisPort;

    @Value("${spring.redis.password}")
    private String redisPassword;

    @Value("${spring.redis.timeout}")
    private Integer redisTimeOut;

    @Value("${spring.redis.jedis.pool.max-active}")
    private Integer redisMaxActive;

    @Value("${spring.redis.jedis.pool.max-idle}")
    private Integer redisMaxidle;

    @Value("${spring.redis.jedis.pool.min-idle}")
    private Integer redisMinidle;


    @Bean
    public JedisPool JedisPoolConfig(){
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(redisMaxidle);
        jedisPoolConfig.setMinIdle(redisMinidle);
        jedisPoolConfig.setMaxTotal(redisMaxActive);
        JedisPool jedisPool = new JedisPool(jedisPoolConfig,redisHost,redisPort,redisTimeOut,redisPassword);
        return jedisPool;

    }




}
