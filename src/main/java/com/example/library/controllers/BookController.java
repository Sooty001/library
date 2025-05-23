package com.example.library.controllers;

import com.example.library.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final List<Book> books = new ArrayList<>();

    public BookController() {
        books.add(new Book(1, "Война и мир", 1));
        books.add(new Book(2, "Преступление и наказание", 2));
        books.add(new Book(3, "Вишнёвый сад", 3));
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return books;
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        books.add(book);
        return book;
    }
}
