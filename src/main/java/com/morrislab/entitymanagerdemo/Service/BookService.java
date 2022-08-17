package com.morrislab.entitymanagerdemo.Service;

import com.morrislab.entitymanagerdemo.entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
@Slf4j
public class BookService {

    private final EntityManager entityManager;

    public BookService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void fetchBook() {

       log.info(entityManager.createNativeQuery("select * from tbl_books where id = '1'",
               Book.class).getSingleResult().toString());
    }
}
