package com.hungnm.demos.graphql.services;

import com.hungnm.demos.graphql.model.Book;

import java.util.List;

public interface IBookService {
    Book getBookWithTitle(String title);

    List<Book> getAllBooks();

    Book addBook(Book book);

    Book updateBook(Book book);

    boolean deleteBook(Book book);
}
