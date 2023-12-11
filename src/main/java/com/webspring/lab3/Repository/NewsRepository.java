package com.webspring.lab3.Repository;

import com.webspring.lab3.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface NewsRepository extends JpaRepository<News, Long> {
    Optional<News> findById(Long id);

    News save(News news);

}