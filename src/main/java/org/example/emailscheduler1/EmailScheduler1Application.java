package org.example.emailscheduler1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class EmailScheduler1Application {

    public static void main(String[] args) {
        SpringApplication.run(EmailScheduler1Application.class, args);
    }

}
