package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {


    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /*public String getBook(Long id) {
        return books.get(id.intValue() - 1);
    } */


    public Book getById(long id) {
        return bookRepository.findById(id).orElseThrow();
    }

}
