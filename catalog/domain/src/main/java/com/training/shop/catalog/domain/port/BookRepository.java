package com.training.shop.catalog.domain.port;

import com.training.shop.catalog.domain.model.Book;

public interface BookRepository {
    void add(Book book);
}
