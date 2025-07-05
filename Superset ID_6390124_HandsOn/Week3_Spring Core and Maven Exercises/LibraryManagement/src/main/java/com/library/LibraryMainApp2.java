package com.library;

import com.library.service.BookService2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryMainApp2 {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml")) {
            BookService2 service = context.getBean("bookService2", BookService2.class);
            service.addBook("Spring IoC with Custom Beans");
        }
    }
}
