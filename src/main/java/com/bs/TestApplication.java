package com.bs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(TestApplication.class);
        sa.run(args);
    }
}
