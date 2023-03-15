package com.siture.webApplication.repositories;

import com.siture.webApplication.models.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findByTitle(String title);
    Page<Project> findAll(Pageable pageable);
}
