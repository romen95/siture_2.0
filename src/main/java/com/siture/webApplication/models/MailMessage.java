package com.siture.webApplication.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailMessage {
    private String name;
    private String phone;
    private String message;

    public MailMessage(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}
