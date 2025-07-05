package com.library.service;

import com.library.repository.BookRepository2;

public class BookService2 {

    private BookRepository2 bookRepository2;

    // Setter for Dependency Injection
    public void setBookRepository2(BookRepository2 bookRepository2) {
        this.bookRepository2 = bookRepository2;
    }

    public void addBook(String title) {
        System.out.println("BookService2: Adding book...");
        bookRepository2.saveBook(title);
    }
}
