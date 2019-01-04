package com.ramonboza.tutorial.spring.microservices.ratingservice;

public class Rating {
    private Long id;
    private Long bookId;
    private int stars;

    protected Rating() {

    }

    public Rating(Long id, Long bookId, int stars) {
        this.id = id;
        this.bookId = bookId;
        this.stars = stars;
    }

    public Long getId() {
        return id;
    }

    public Long getBookId() {
        return bookId;
    }

    public int getStars() {
        return stars;
    }
}
