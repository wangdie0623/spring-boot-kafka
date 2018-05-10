package com.wang.springboot.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicsDemo {

    @Bean
    public NewTopic topic1(){
        return new NewTopic("foo",10,(short) 2);
    }
}
