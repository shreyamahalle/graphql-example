package com.shreya.graphql.controller;

import com.shreya.graphql.model.Book;
import com.shreya.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
    @Autowired
    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping("/")
    @QueryMapping
    public Book bookById(@Argument String id) {
        return service.getBookById(id).orElse(null);
    }
}