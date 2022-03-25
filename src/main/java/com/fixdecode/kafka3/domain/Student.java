package com.fixdecode.kafka3.domain;

import lombok.Data;

import java.util.UUID;

@Data
public class Student {
    private UUID id;
    private String name;
    private String email;
    private String department;

    public Student(String name, String email, String department) {
        id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.department = department;
    }

    public Student() {
    }
}
