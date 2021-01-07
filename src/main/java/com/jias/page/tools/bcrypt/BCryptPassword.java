package com.jias.music.tools.bcrypt;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class BCryptPassword {

    @Bean
    public BCryptPasswordEncoder password(){
        return new BCryptPasswordEncoder();
    }
}
