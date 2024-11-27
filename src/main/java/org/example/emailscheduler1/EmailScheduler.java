package org.example.emailscheduler1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EmailScheduler {

    @Autowired
    private EmailService emailService;


    @Scheduled(cron = "0 18 22 * * ?")
    public void scheduleEmail() {
        String to = "sggurjar777@gmail.com";
        String subject = "Scheduled Email";
        String text = "This is an automatic email sent by Aniket gurjar!";

        emailService.sendEmail(to, subject, text);
        System.out.println("Scheduled email sent successfully!");
    }
}
