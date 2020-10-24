package com.fullstack.spring.neo4j.api.controller;

import com.fullstack.spring.neo4j.api.model.Book;
import com.fullstack.spring.neo4j.api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/addBook")
    public String addBook (@RequestBody Book book) {
        bookRepository.save(book);
        return "Book saved successfully.";
    }

    @GetMapping("/listBooks")
    public List<Book> listBooks() {
        return (List<Book>) bookRepository.findAll();
    }

    @GetMapping("/getBookByBookName/{bookName}")
    public Book getBookByBookName(@PathVariable String bookName) {
        return bookRepository.findByBookName(bookName);
    }

    @DeleteMapping("/deleteBookById/{id}")
    public String deleteBookById(@PathVariable Long id) {
        bookRepository.deleteById(id);
        return "Book deleted successfully with id : " + id;
    }
}
