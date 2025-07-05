package com.library;

import com.library.service.BookService3;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryMainApp3 {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml")) {
            BookService3 service = context.getBean("bookService3", BookService3.class);
            service.addBook("Advanced Spring Injection");
        }
    }
}
