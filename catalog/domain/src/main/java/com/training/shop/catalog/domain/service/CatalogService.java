package com.training.shop.catalog.domain.service;

import com.training.shop.catalog.domain.model.Book;
import com.training.shop.catalog.domain.model.BookVariant;
import com.training.shop.catalog.domain.port.BookRepository;
import com.training.shop.catalog.domain.port.BookVariantRepository;

import java.util.List;

public class CatalogService {

    private final BookRepository bookRepository;
    private final BookVariantRepository bookVariantRepository;

    public CatalogService(BookRepository bookRepository, BookVariantRepository bookVariantRepository) {
        this.bookRepository = bookRepository;
        this.bookVariantRepository = bookVariantRepository;
    }

    public final void addBook(Book book, List<BookVariant> variants) {
        bookRepository.add(book);
        bookVariantRepository.addAll(variants);
    }

}
