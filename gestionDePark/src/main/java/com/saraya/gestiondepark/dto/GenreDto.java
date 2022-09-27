package com.saraya.gestiondepark.dto;

import com.saraya.gestiondepark.models.Book;

import java.util.List;

public class GenreDto {
    private long id;
    private String name;
    private List<Book> books;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
