package org.exampledriven.rest;

import java.util.List;

public class Book {
    public enum BookType {COMIC_BOOK, NEWS_PAPER, BOOK};
    //Frame size 19698128 exceeds maximum: 4194304. If this is normal, increase the maxMessageSize in the channel/server builder
    private String ISBN;
    private String author;
    private String title;
    private int page;
    private List<String> keyword;
    private BookType bookType;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<String> getKeyword() {
        return keyword;
    }

    public void setKeyword(List<String> keyword) {
        this.keyword = keyword;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }


}
