package com.javaMailSender.Java_Mail_Sender.service;

import com.javaMailSender.Java_Mail_Sender.dto.MailDetailsDto;

public interface IMailService {
    String sendMailWithAttachment(MailDetailsDto mailDetailsDto);
    String sendSimpleMail(MailDetailsDto mailDetailsDto);
}
