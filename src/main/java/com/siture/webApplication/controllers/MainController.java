package com.siture.webApplication.controllers;

import com.siture.webApplication.files.BitrixService;
import com.siture.webApplication.models.MailMessage;
import com.siture.webApplication.models.Project;
import com.siture.webApplication.repositories.ProjectRepository;
import com.siture.webApplication.services.EmailSenderService;
import com.siture.webApplication.services.ProjectService;
import com.siture.webApplication.services.UserService;
import com.sun.mail.imap.protocol.Item;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @GetMapping("/projects/kitchens/{pageNumber}")
    public String showPage(@PathVariable("pageNumber") int pageNumber, Model model) {
        int pageSize = 3;

        Page<Project> page = projectService.findPaginated(pageNumber, pageSize);
        List<Project> projects = page.getContent();

        model.addAttribute("currentPage", pageNumber);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());
        model.addAttribute("projects", projects);
//        @RequestParam(name = "title", required = false) String title, Principal principal,
//        model.addAttribute("user", userService.getUserByPrincipal(principal));
//        model.addAttribute("projects", projectService.listProjects());
        return "kitchens-shop";
    }

    @GetMapping("/projects/kitchen/{id}")
    public String projectsDetails(@PathVariable(value = "id") long id, Model model) {

        Optional<Project> project = projectService.getProjectsById(id);
        ArrayList<Project> res = new ArrayList<>();
        project.ifPresent(res::add);
        model.addAttribute("kitchen", res);

        return "kitchen-details";
    }

    @GetMapping("/index_5")
    public String index5(Model model) {
        return "index-5";
    }

}
