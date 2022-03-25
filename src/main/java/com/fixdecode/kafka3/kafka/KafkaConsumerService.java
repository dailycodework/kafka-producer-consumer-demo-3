package com.fixdecode.kafka3.kafka;

import com.fixdecode.kafka3.domain.Student;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KafkaConsumerService {


    @KafkaListener(topics = "students", groupId = "studentGroupId")
    public void consumer(Student student){
        System.out.println("New student received :" +student);
    }
}
