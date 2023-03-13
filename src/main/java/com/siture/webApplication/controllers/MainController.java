package com.siture.webApplication.controllers;

import com.siture.webApplication.files.BitrixService;
import com.siture.webApplication.repositories.ProjectRepository;
import com.siture.webApplication.services.EmailSenderService;
import com.siture.webApplication.services.ProjectService;
import com.siture.webApplication.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
@AllArgsConstructor
public class MainController {
    private ProjectRepository projectRepository;
    private final ProjectService projectService;
    private UserService userService;
    private EmailSenderService emailSenderService;

    @GetMapping("/")
    public String index() {
        emailSenderService.sendSimpleEmail("romenromenromen95@gmail.com", "Тема письма", "Привет!");
//        model.addAttribute("user", userService.getUserByPrincipal(principal));
        return "index222";
    }

    @GetMapping("/index_5")
    public String index5(Model model) {
        return "index-5";
    }

}
