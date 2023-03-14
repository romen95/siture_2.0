package com.siture.webApplication.controllers;

import com.siture.webApplication.models.MailMessage;

import com.siture.webApplication.services.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @Autowired
    private EmailSenderService emailSenderService;

    @RequestMapping(method = RequestMethod.GET, value = "/get_message")
    public MailMessage getTestMessage() {
        return new MailMessage("Иван", "88002223535");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add_message")
    public void addMessage(@RequestBody MailMessage mailMessage) {
        System.out.println(mailMessage.getName());
    }
}
