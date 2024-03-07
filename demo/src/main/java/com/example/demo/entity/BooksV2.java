package com.example.demo.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "booksv2")
public class BooksV2 {
    public BooksV2() {
    }

    public BooksV2(long id, String title,String author,BigDecimal price) {
        this.id = (int) id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;



}
