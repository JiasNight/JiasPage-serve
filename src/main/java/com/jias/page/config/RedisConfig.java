package com.jias.page.config;

import com.jias.page.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<Object, User> redisTemplate(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<Object, User> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);

        Jackson2JsonRedisSerializer<User> ser = new Jackson2JsonRedisSerializer<>(User.class);
        template.setDefaultSerializer(ser);
        return template;
    }
}
