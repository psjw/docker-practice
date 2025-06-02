package com.psjw.dockerdbcachespringboot;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AppController {
    private final RedisTemplate<String, Object> redisTemplate;

    public AppController(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }


    @GetMapping("/")
    public String home(){
        redisTemplate.opsForValue().set("abc", "def");
        return "Hello World";
    }

}
