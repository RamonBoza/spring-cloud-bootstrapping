package com.ramonboza.tutorial.spring.microservices.bookservice;

public class Book {
    private Long id;
    private String author;
    private String title;

    protected Book() {

    }

    public Book(Long id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
