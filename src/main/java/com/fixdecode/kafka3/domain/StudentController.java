package com.fixdecode.kafka3.domain;

import com.fixdecode.kafka3.kafka.KafkaProducerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/students")
@AllArgsConstructor
public class StudentController {

    private KafkaProducerService producerService;

    @PostMapping
    public void publish(@RequestBody Student student){
        producerService.publish(student);
    }
}
