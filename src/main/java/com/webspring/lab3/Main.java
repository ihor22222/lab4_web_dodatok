package com.webspring.lab3;

import com.webspring.lab3.Repository.ManualNewsRepository;
import com.webspring.lab3.Repository.ManualProjectRepository;
import com.webspring.lab3.Repository.NewsRepository;
import com.webspring.lab3.Repository.ProjectRepository;
import com.webspring.lab3.service.ManualNewsService;
import com.webspring.lab3.service.ManualProjectService;
import com.webspring.lab3.utility.DatabaseChecker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		NewsPage newsPage = context.getBean(NewsPage.class);
		NewsRepository newsRepository = new ManualNewsRepository();
		ManualNewsService manualNewsService = new ManualNewsService(newsRepository);

		ProjectRepository projectRepository = new ManualProjectRepository();
		ManualProjectService manualProjectService = new ManualProjectService(projectRepository);

		News news = newsPage.getNews();
		news.someMethod();
		news.anotherMethod();

		Project project = news.getProject();
		if (project != null) {
			System.out.println("Проект: " + project.getProjectName());
		} else {
			System.out.println("Проект відсутній або має значення null");
		}

		System.out.println("URL сторінки: " + newsPage.getPageUrl());
		System.out.println("Заголовок новини: " + news.getHeadline());
		System.out.println("Текст новини: " + news.getContent());
}}
