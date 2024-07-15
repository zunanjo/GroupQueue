package com.example.groupqueue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GroupQueueApplication {

    public static void main(String[] args) {
        SpringApplication.run(GroupQueueApplication.class, args);
    }

}
