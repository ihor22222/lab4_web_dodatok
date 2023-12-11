package com.webspring.lab3;

import com.webspring.lab3.Repository.ManualNewsRepository;
import com.webspring.lab3.Repository.ManualProjectRepository;
import com.webspring.lab3.Repository.NewsRepository;
import com.webspring.lab3.Repository.ProjectRepository;
import com.webspring.lab3.service.ManualNewsService;
import com.webspring.lab3.service.ManualProjectService;
import org.springframework.context.annotation.*;

@PropertySource("classpath:application.properties")
@Configuration
@ComponentScan(basePackages = "com.webspring.lab3")
@EnableAspectJAutoProxy
public class AppConfig {
    @Bean
    public NewsRepository newsRepository() {
        return new ManualNewsRepository();
    }

    @Bean
    public ManualNewsService newsService(NewsRepository newsRepository) {
        return new ManualNewsService(newsRepository);
    }

    @Bean
    public ProjectRepository projectRepository() {
        return new ManualProjectRepository();
    }

    @Bean
    public ManualProjectService projectService(ProjectRepository projectRepository) {
        return new ManualProjectService(projectRepository);
    }
}
