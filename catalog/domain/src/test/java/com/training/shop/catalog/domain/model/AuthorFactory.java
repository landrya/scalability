package com.training.shop.catalog.domain.model;

import java.util.UUID;

public class AuthorFactory {
    private String firstname;
    private String lastname;
    private String id;

    public static AuthorFactory initialize() {
        AuthorFactory authorFactory = new AuthorFactory();
        authorFactory.id = UUID.randomUUID().toString();
        authorFactory.firstname = UUID.randomUUID().toString();
        authorFactory.lastname = UUID.randomUUID().toString();
        return authorFactory;
    }

    public Author build() {
        return new Author(firstname, lastname, id);
    }
}
