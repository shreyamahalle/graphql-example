package com.shreya.graphql.service;
import com.shreya.graphql.model.Book;
import com.shreya.graphql.repository.BookRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public Optional<Book> getBookById(String id) {
        return repo.findById(id);
    }
}