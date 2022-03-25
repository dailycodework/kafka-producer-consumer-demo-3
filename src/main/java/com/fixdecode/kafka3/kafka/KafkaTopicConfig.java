package com.fixdecode.kafka3.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic student(){
        return TopicBuilder.name("students").partitions(2).build();
    }

    @Bean
    public NewTopic courses(){
        return TopicBuilder.name("courses").partitions(3).build();
    }
}
