package com.webspring.lab3.Interfece;

import com.webspring.lab3.Project;

public interface ProjectService {
    Project getProjectById(Long id);
    void saveProject(Project project);

}

