package com.siture.webApplication.controllers;

import com.siture.webApplication.models.MailMessage;
import com.siture.webApplication.models.Project;
import com.siture.webApplication.models.User;
import com.siture.webApplication.repositories.ProjectRepository;
import com.siture.webApplication.services.EmailSenderService;
import com.siture.webApplication.services.ProjectService;
import com.siture.webApplication.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class ProjectsController {
    private final ProjectService projectService;
    private final UserService userService;
    @Autowired
    private EmailSenderService emailSenderService;

    @RequestMapping(method = RequestMethod.POST, value = "/send")
    public void sendMessage(@RequestBody MailMessage mailMessage) {
        emailSenderService.sendSimpleEmail("romenromenromen95@gmail.com", "Заявка с сайта Siture.ru; Имя: " + mailMessage.getName() + ", телефон: " + mailMessage.getPhone(), mailMessage.getMessage());
    }


//    @GetMapping("/projects")
//    public String projects(@RequestParam(name = "title", required = false) String title, Principal principal, Model model) {
//        model.addAttribute("user", userService.getUserByPrincipal(principal));
//        model.addAttribute("projects", projectService.listProjects(title));
//        return "projects";
//    }

//    @GetMapping("/projects/kitchens")
//    public String projects(Model model) {
////        @RequestParam(name = "title", required = false) String title, Principal principal,
////        model.addAttribute("user", userService.getUserByPrincipal(principal));
////        model.addAttribute("projects", projectService.listProjects(title));
//        return "kitchens-shop";
//    }
//
//    @GetMapping("/create")
//    public String create() {
//        return "create-project";
//    }
//
//    @PostMapping("/create")
//    public String createProject(Project project, Model model) {
//        projectService.saveProject(project);
//        return "redirect:/projects";
//    }
//
//    @GetMapping("/projects/{id}")
//    public String projectsDetails(@PathVariable(value = "id") long id, User user, Model model) {
//        model.addAttribute("user", user);
//        if (!projectService.existsById(id)) {
//            return "redirect:/projects";
//        }
//
//        Optional<Project> project = projectService.getProjectsById(id);
//        ArrayList<Project> res = new ArrayList<>();
//        project.ifPresent(res::add);
//        model.addAttribute("project", res);
//        return "project-details";
//    }

//    @GetMapping("/projects")
//    public String projectsMain(@RequestParam(name = "title", required = false) String title, Principal principal, Model model) {
//        User currentUser = userService.getUserByPrincipal(principal);
//        model.addAttribute("user", currentUser);
//        model.addAttribute("projects", projectService.listProjects(title));
//        return "projects";
//    }
//
//    @GetMapping("/projects/add")
//    public String projectsAdd(Model model) {
//        return "projects-add";
//    }
//
//    @PostMapping("/projects/add")
//    public String projectsFormAdd(@RequestParam String title, @RequestParam String description, @RequestParam Integer price, Model model) {
//        Project project = new Project(title, description, price);
//        projectRepository.save(project);
//        return "redirect:/projects";
//    }
//
//
//    @GetMapping("/projects/{id}/edit")
//    public String projectsEdit(@PathVariable(value = "id") long id, Model model) {
//        if (!projectRepository.existsById(id)) {
//            return "redirect:/projects";
//        }
//
//        Optional<Project> project = projectRepository.findById(id);
//        ArrayList<Project> res = new ArrayList<>();
//        project.ifPresent(res::add);
//        model.addAttribute("project", res);
//        return "projects-edit";
//    }
//
//    @PostMapping("/projects/{id}/edit")
//    public String projectsUpdate(@PathVariable(value = "id") long id, @RequestParam String title, @RequestParam Integer price, @RequestParam String description, Model model) {
//        Project project = projectRepository.findById(id).orElseThrow();
//        project.setTitle(title);
//        project.setDescription(description);
//        project.setPrice(price);
//        projectRepository.save(project);
//        return "redirect:/projects";
//    }
//
//    @PostMapping("/projects/{id}/remove")
//    public String projectsDelete(@PathVariable(value = "id") long id, Model model) {
//        if (!projectRepository.existsById(id)) {
//            return "redirect:/projects";
//        }
//
//        Project project = projectRepository.findById(id).orElseThrow();
//        projectRepository.delete(project);
//        return "redirect:/projects";
//    }

}
