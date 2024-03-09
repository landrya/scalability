package com.training.shop.catalog.domain.model;

import java.util.UUID;

public class BookFactory {

    private String id;
    private String title;
    private Author author;
    private String description;

    public static BookFactory initialize() {
        BookFactory bookFactory = new BookFactory();
        bookFactory.id = UUID.randomUUID().toString();
        bookFactory.title = UUID.randomUUID().toString();
        bookFactory.description = UUID.randomUUID().toString();
        bookFactory.author = AuthorFactory.initialize().build();
        return bookFactory;
    }

    public Book build() {
        return new Book(id, title, author, description);
    }

}
