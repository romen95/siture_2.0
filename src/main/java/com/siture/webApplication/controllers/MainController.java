package com.siture.webApplication.controllers;

import com.siture.webApplication.files.BitrixService;
import com.siture.webApplication.models.MailMessage;
import com.siture.webApplication.repositories.ProjectRepository;
import com.siture.webApplication.services.EmailSenderService;
import com.siture.webApplication.services.ProjectService;
import com.siture.webApplication.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

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
//        model.addAttribute("user", userService.getUserByPrincipal(principal));
        return "index222";
    }

    @GetMapping("/projects/kitchens")
    public String projects(Model model) {
//        @RequestParam(name = "title", required = false) String title, Principal principal,
//        model.addAttribute("user", userService.getUserByPrincipal(principal));
        model.addAttribute("projects", projectService.listProjects());
        return "kitchens-shop";
    }

    @GetMapping("/index_5")
    public String index5(Model model) {
        return "index-5";
    }

}
