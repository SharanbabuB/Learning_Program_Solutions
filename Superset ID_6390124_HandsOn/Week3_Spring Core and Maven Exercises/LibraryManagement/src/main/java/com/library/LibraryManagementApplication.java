package com.library;

import com.library.service.BookService1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml")) {
            BookService1 bookService = context.getBean("bookService", BookService1.class);
            bookService.addBook("Spring Dependency Injection Guide");
        }
    }
}
