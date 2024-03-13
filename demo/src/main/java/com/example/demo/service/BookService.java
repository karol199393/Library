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

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book removeBook(long id) {
        Book book = bookRepository.findById(id).orElseThrow();
        bookRepository.delete(book);
        return book;
    }

    public Book updateBook(long id) {
        Book book = bookRepository.findById(id).orElseThrow();
        bookRepository.save(book);
        return book;
    }

    public Book patchBook(long id, Book book) {
        Book bookToUpdate = bookRepository.findById(id).orElseThrow();
        bookToUpdate.setTitle(book.getTitle());
        bookToUpdate.setAuthor(book.getAuthor());
        bookToUpdate.setIsbn(book.getIsbn());
        bookRepository.save(bookToUpdate);
        return bookToUpdate;
    }



}
