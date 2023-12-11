    package com.webspring.lab3;

    import jakarta.annotation.PostConstruct;
    import jakarta.annotation.PreDestroy;
    import jakarta.persistence.*;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.beans.factory.annotation.Value;
    import org.springframework.stereotype.Component;

    import java.util.List;


    @Entity
    @Component
    public class Project {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String projectName;

        @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        private List<News> newsList;

        // Геттери та сеттери для id
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        // Геттери та сеттери для projectName
        public String getProjectName() {
            return projectName;
        }

        public void setProjectName(String projectName) {
            this.projectName = projectName;
        }

        // Геттери та сеттери для newsList
        public List<News> getNewsList() {
            return newsList;
        }

        public void setNewsList(List<News> newsList) {
            this.newsList = newsList;
        }
    }