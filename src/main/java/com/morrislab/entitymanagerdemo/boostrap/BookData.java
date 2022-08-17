package com.morrislab.entitymanagerdemo.boostrap;

import com.morrislab.entitymanagerdemo.Repo.BookRepository;
import com.morrislab.entitymanagerdemo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookData implements CommandLineRunner {

    @Autowired
    private BookRepository repo;

    @Override
    public void run(String... args) throws Exception {

        Book book = Book.builder()
                .isbn("BHTFG")
                .title("The river between")
                .build();

        repo.save(book);

    }
}
