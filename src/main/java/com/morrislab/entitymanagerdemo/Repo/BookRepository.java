package com.morrislab.entitymanagerdemo.Repo;

import com.morrislab.entitymanagerdemo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
