package com.javaMailSender.Java_Mail_Sender.controller;

import com.javaMailSender.Java_Mail_Sender.service.MailService;
import com.javaMailSender.Java_Mail_Sender.dto.MailDetailsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mail")
public class MailController {

    @Autowired
    private MailService mailService;

    @PostMapping("/send")
    public String sendMail(@ModelAttribute MailDetailsDto mailDetailsDto) {
        if (mailDetailsDto.getAttachment() != null && !mailDetailsDto.getAttachment().isEmpty()) {
            return mailService.sendMailWithAttachment(mailDetailsDto);
        }
        else {
            return mailService.sendSimpleMail(mailDetailsDto);
        }
    }
}
