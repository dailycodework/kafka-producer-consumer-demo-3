package com.fixdecode.kafka3.kafka;

import com.fixdecode.kafka3.domain.Student;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KafkaProducerService {

    private KafkaTemplate<String, Object> kafkaTemplate;


    public void publish(Student student) {
        kafkaTemplate.send("students",
                new Student(student.getName(), student.getEmail(), student.getDepartment()));
    }
}
