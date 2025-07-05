package com.library.service;

import com.library.repository.BookRepository3;

public class BookService3 {
    private String libraryName;
    private BookRepository3 bookRepository3;

    // Constructor injection
    public BookService3(String libraryName) {
        this.libraryName = libraryName;
    }

    // Setter injection
    public void setBookRepository3(BookRepository3 bookRepository3) {
        this.bookRepository3 = bookRepository3;
    }

    public void addBook(String title) {
        System.out.println("[" + libraryName + "] BookService3: Adding book...");
        bookRepository3.saveBook(title);
    }
}
