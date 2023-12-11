package com.webspring.lab3.service;

import com.webspring.lab3.News;
import com.webspring.lab3.Repository.NewsRepository;

public class ManualNewsService extends NewsService {

    private final NewsRepository newsRepository;

    public ManualNewsService(NewsRepository newsRepository) {
        super(newsRepository);
        this.newsRepository = newsRepository;
    }

    public News saveNews(News news) {
        return newsRepository.save(news);
    }

    // Інші методи для роботи з новинами через репозиторій
}
