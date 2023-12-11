package com.webspring.lab3.utility;

import com.webspring.lab3.Project;
import com.webspring.lab3.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class checkProjectData {

    @Autowired
    private ProjectRepository projectRepository; // Застосуйте відповідний репозиторій

    public void checkProjectData() {
        // Отримання списку всіх проектів з бази даних
        List<Project> projects = projectRepository.findAll();

        if (!projects.isEmpty()) {
            // Виведення назв перших трьох проектів
            for (int i = 0; i < Math.min(3, projects.size()); i++) {
                System.out.println("Project Name: " + projects.get(i).getProjectName());
            }
        } else {
            System.out.println("Таблиця 'Project' порожня");
        }
    }
}
