package com.example.demo.book.db.repository;

import com.example.demo.book.db.entity.BookEntity;
import com.example.demo.db.SimpleDataRepository;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository extends SimpleDataRepository<BookEntity, Long> {
}
