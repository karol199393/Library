package com.example.demo.service;

import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final BookRepository bookRepository;

    @Autowired
    public UserService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public String getUser() {
        return "User";
    }

    public String getBook() {
        return "Book";
    }

}
