package com.company.practice3.practice3_3;

public class Book {
    private String author;
    private String name;
    private int time;

    public Book(String author, String name, int time) {
        this.author = author;
        this.name = name;
        this.time = time;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
