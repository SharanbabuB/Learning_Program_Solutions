package com.library.service;

import com.library.repository.BookRepository1;

public class BookService1 {

    private BookRepository1 bookRepository;

    // Setter for Dependency Injection
    public void setBookRepository(BookRepository1 bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title) {
        System.out.println("BookService: Adding book...");
        bookRepository.saveBook(title);
    }
}
