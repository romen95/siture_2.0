package com.siture.webApplication.services;

import com.siture.webApplication.models.Project;
import com.siture.webApplication.repositories.ProjectRepository;
import com.sun.mail.imap.protocol.Item;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectRepository projectRepository;

    public List<Project> listProjects() {
        return projectRepository.findAll();
    }

    public void saveProject(Project project) {
        log.info("Saving new {}", project);
        projectRepository.save(project);
    }

    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }

    public Optional<Project> getProjectsById(Long id) {
        return projectRepository.findById(id);
    }

    public boolean existsById(Long id) {
        return projectRepository.existsById(id);
    }

    public Page<Project> findPaginated(int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber - 1, pageSize);
        return projectRepository.findAll(pageable);
    }
}
