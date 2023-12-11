package com.webspring.lab3.service;


import com.webspring.lab3.Project;
import com.webspring.lab3.Repository.ProjectRepository;
public class ManualProjectService extends ProjectService {
    private final ProjectRepository projectRepository;

    public ManualProjectService(ProjectRepository projectRepository) {
        super(projectRepository); // Викликати конструктор базового класу
        this.projectRepository = projectRepository;
    }

    @Override
    public Project getProjectById(Long id) {
        return projectRepository.findById(id).orElse(null);
    }

    @Override
    public Project saveProject(Project project) {
        projectRepository.save(project);
        return project;
    }
    // Інші методи...
}