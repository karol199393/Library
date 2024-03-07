package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    public Book() {
    }

    public Book(long id,String title) {
        this.id = (int) id;
        this.title = title;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    public String getTitle() {
        return title;
    }
}
