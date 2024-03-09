package com.training.shop.catalog.domain.model;

import java.util.UUID;

public class BookVariantFactory {
    private String id;
    private String bookId;
    private Format format;
    private Language language;

    public static BookVariantFactory initialize() {
        BookVariantFactory bookVariantFactory = new BookVariantFactory();
        bookVariantFactory.id = UUID.randomUUID().toString();
        bookVariantFactory.bookId = UUID.randomUUID().toString();
        bookVariantFactory.format = Format.PAPER;
        bookVariantFactory.language = Language.FRENCH;
        return bookVariantFactory;
    }

    public BookVariant build() {
        return new BookVariant(id, bookId, format, language);
    }
}
