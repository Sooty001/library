package com.example.library.controllers;

import com.example.library.domain.Author;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    private final List<Author> authors = new ArrayList<>();

    @GetMapping
    public List<Author> getAllAuthors() {
        return authors;
    }

    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        authors.add(author);
        return author;
    }
}