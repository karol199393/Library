package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ksiazki")
public class Book {
    public Book() {
    }

    public Book(long id,String title,String author,String isbn) {
        this.id = (int) id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String author;
    private String isbn;


    public String getTitle() {
        return title;
    }
}
