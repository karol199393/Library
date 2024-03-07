package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private List<String> books = new ArrayList<>();

    public BookService(BookRepository bookRepository) {
        books.add("Book 1");
        books.add("Book 2");
        books.add("Book 3");
    }

    public String getBook(Long id) {
        return books.get(id.intValue() - 1);
    }


    public Book getById(long id) {
        return new Book(id, "Book " + id);
    }

}
