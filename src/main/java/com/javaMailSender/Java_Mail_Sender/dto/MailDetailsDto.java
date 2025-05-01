package com.javaMailSender.Java_Mail_Sender.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailDetailsDto {
    private String to;
    private String subject;
    private String body;
    private MultipartFile attachment;
}
