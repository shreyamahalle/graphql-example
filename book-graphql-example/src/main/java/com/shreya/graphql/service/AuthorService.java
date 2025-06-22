package com.shreya.graphql.service;

import com.shreya.graphql.model.Author;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AuthorService {
    private List<Author> authors = new ArrayList<>();

    public AuthorService(){
        authors.add(new Author(1,"shreya","mahalle"));
        authors.add(new Author(2,"shreya","mahalle"));
        authors.add(new Author(3,"abc","rd"));
        authors.add(new Author(4,"sfwgfre","eeg"));
        authors.add(new Author(5,"wf","wwer"));
        authors.add(new Author(6,"shreya","mahalle"));
    }

    public Author getById(int id){
        return authors.stream().filter(author -> author.id()== id).findFirst().orElse(null);
    }
}
