package com.shreya.graphql.service;

import com.shreya.graphql.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    List<Book> books = new ArrayList<>();

    public BookService(){
        books.add(new Book(1,"java", 34,1));
        books.add(new Book(2,"pattern", 80,2));
        books.add(new Book(3,"python", 54,3));
        books.add(new Book(4,"sql", 11,4));
        books.add(new Book(5,"mysql", 78,5));
        books.add(new Book(6,"html", 99,6));
    }
    public Book getById(int id){
        return books.stream().filter(book -> book.id()==id).findFirst().orElse(null);
    }
}
