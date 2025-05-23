package com.example.library.domain;

public class Book {
    private int id;
    private String title;
    private int authorId;

    public Book(int id, String title, int authorId) {
        this.id = id;
        this.title = title;
        this.authorId = authorId;
    }

    protected Book() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public int getAuthorId() { return authorId; }
    public void setAuthorId(int authorId) { this.authorId = authorId; }
}
