package com.training.shop.catalog.domain.service;

import com.training.shop.catalog.domain.model.Book;
import com.training.shop.catalog.domain.model.BookFactory;
import com.training.shop.catalog.domain.model.BookVariant;
import com.training.shop.catalog.domain.model.BookVariantFactory;
import com.training.shop.catalog.domain.port.BookRepository;
import com.training.shop.catalog.domain.port.BookVariantRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class CatalogServiceTest {

    @Mock
    private BookRepository bookRepository;
    @Mock
    private BookVariantRepository bookVariantRepository;

    @InjectMocks
    private CatalogService catalogService;

    @Test
    void should_add_book() {

        // Arrange
        Book book = BookFactory.initialize().build();
        BookVariant bookVariant = BookVariantFactory.initialize().build();

        // Act
        catalogService.addBook(book, List.of(bookVariant));

        // Assert
        verify(bookRepository).add(book);
        verify(bookVariantRepository).addAll(List.of(bookVariant));

    }



}