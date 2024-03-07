package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;

import java.util.List;

public class BookServicev2 {
    BookRepository bookRepository;

    public BookServicev2(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }


}
