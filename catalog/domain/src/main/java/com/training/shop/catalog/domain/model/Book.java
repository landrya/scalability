package com.training.shop.catalog.domain.model;

public record Book(
        String id,
        String title,
        Author author,
        String description) {
}
