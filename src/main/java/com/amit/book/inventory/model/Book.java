package com.amit.book.inventory.model;

import lombok.Data;

@Data
public class Book {
    private int bookId;
    private String name;
    private String author;
    private String publisher;
    private int noOfCopies;
    private BookCategory category; // Use BookCategory enum instead of String
    private String storeLocation;
    private int price;
}