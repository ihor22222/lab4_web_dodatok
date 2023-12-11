package com.webspring.lab3.utility;

import com.webspring.lab3.Project;
import com.webspring.lab3.Repository.ProjectRepository;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@Component
public class DatabaseChecker {
    private static final Logger logger = LoggerFactory.getLogger(DatabaseChecker.class);

    private final DataSource dataSource;

    @Autowired
    public DatabaseChecker(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    private ProjectRepository projectRepository;

    @PostConstruct
    public void checkDatabaseConnection() {
        try {
            // Перевірка з'єднання з базою даних
            Connection connection = dataSource.getConnection();
            logger.info("Підключено до бази даних: {}", connection.getMetaData().getDatabaseProductName());
            connection.close();
        } catch (SQLException e) {
            logger.error("Помилка підключення до бази даних: {}", e.getMessage());
        }
    }
}
