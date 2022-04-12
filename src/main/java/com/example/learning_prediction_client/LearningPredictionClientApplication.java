package com.example.learning_prediction_client;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.learning_prediction_client.mapper")
public class LearningPredictionClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningPredictionClientApplication.class, args);
    }

}
