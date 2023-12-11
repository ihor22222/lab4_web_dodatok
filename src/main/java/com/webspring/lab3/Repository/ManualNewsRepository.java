package com.webspring.lab3.Repository;

import com.webspring.lab3.News;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class ManualNewsRepository implements NewsRepository {
    private final Map<Long, News> newsMap;

    public ManualNewsRepository() {
        this.newsMap = new HashMap<>();
    }

    @Override
    public Optional<News> findById(Long id) {
        return Optional.ofNullable(newsMap.get(id));
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public News save(News news) {
        newsMap.put(news.getId(), news);
        return news;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends News> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends News> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<News> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public News getOne(Long aLong) {
        return null;
    }

    @Override
    public News getById(Long aLong) {
        return null;
    }

    @Override
    public News getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends News> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends News> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends News> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends News> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends News> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends News> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends News, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends News> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public List<News> findAll() {
        return null;
    }

    @Override
    public List<News> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(News entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends News> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<News> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<News> findAll(Pageable pageable) {
        return null;
    }

    // Реалізуйте інші методи для роботи з новинами, які потрібні
}