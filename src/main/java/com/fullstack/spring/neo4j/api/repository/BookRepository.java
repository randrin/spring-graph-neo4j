package com.fullstack.spring.neo4j.api.repository;

import com.fullstack.spring.neo4j.api.model.Book;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface BookRepository extends Neo4jRepository<Book, Long> {
    Book findByBookName(String bookName);
}
