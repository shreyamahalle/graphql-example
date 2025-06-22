package com.shreya.graphql;

import com.shreya.graphql.model.Book;
import com.shreya.graphql.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootGraphqlExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGraphqlExampleApplication.class, args);
	}
	@Bean
	CommandLineRunner init(BookRepository repo) {
		return args -> {
			repo.save(new Book("1", "Clean Code", "Robert C. Martin"));
			repo.save(new Book("2", "Effective Java", "Joshua Bloch"));
		};
	}

}
