package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import com.example.demo.service.BookServicev2;
import com.example.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    BookService bookService;
    BookServicev2 bookServicev2;


    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book/{id}")
    public String getBookById(@PathVariable Long id) {
        return bookService.getById(id).getTitle();  }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookServicev2.getAllBooks();
    }

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book) {
        return bookService.addBook(book).getTitle();
    }

    @DeleteMapping("/removeBook/{id}")
    public String removeBook(@PathVariable Long id) {
        return bookService.removeBook(id).getTitle();
    }

    @PutMapping("/updateBook/{id}")
    public String updateBook(@PathVariable Long id) {
        return bookService.updateBook(id).getTitle();
    }

    @PatchMapping("/patchBook/{id}")
    public String patchBook(@PathVariable Long id, @RequestBody Book book) {
        return bookService.patchBook(id, book).getTitle();
    }

}
