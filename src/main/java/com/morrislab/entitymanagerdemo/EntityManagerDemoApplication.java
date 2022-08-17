package com.morrislab.entitymanagerdemo;

import com.morrislab.entitymanagerdemo.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EntityManagerDemoApplication {

    @Autowired
    private static BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(EntityManagerDemoApplication.class, args);
        bookService.fetchBook();
    }
}