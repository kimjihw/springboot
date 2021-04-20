package com.school.springboot.controller;

import com.school.springboot.dto.MailDto;
import com.school.springboot.service.MailService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MailController {
    private final MailService mailService;

    @GetMapping("/mail")
    public String Mail(){
        return "mail";
    }

    @PostMapping("/mail")
    public void execMail(MailDto mailDto){
        mailService.mailSend(mailDto);
    }
}
