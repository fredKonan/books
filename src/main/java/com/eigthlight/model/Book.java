package com.eigthlight.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Book {

    private ArrayList<String> author;
    private String title;
    private String publisher;


    public Book() {
    }

    public Book(ArrayList<String> author, String title, String publisher) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
    }

    public ArrayList<String> getAuthor() {
        return author;
    }

    public void setAuthor(ArrayList<String> author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
