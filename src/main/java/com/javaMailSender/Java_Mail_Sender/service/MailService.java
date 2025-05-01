package com.javaMailSender.Java_Mail_Sender.service;

import com.javaMailSender.Java_Mail_Sender.dto.MailDetailsDto;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MailService implements IMailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public String sendSimpleMail(MailDetailsDto details) {
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, false);
            helper.setTo(details.getTo());
            helper.setSubject(details.getSubject());
            helper.setText(details.getBody());
            helper.setFrom("your-email@gmail.com");

            javaMailSender.send(message);
            return "send message success!";
        } catch (Exception e) {
            return "failed to send message " + e.getMessage();
        }
    }

    @Override
    public String sendMailWithAttachment(MailDetailsDto details) {
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setTo(details.getTo());
            helper.setSubject(details.getSubject());
            helper.setText(details.getBody());
            helper.setFrom("your-email@gmail.com");

            if (details.getAttachment() != null && !details.getAttachment().isEmpty()) {
                String filename = details.getAttachment().getOriginalFilename();
                InputStreamSource source = details.getAttachment()::getInputStream;
                helper.addAttachment(filename, source);
            }

            javaMailSender.send(message);
            return "send message with attachment success!";
        } catch (Exception e) {
            return "failed to send message with attachment! " + e.getMessage();
        }
    }
}
