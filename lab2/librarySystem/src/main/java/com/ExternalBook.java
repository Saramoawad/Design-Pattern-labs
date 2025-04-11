package com;

public class ExternalBook implements Borrowable {
    private String bookTitle;
    private String authorName;
    private int year;
    private boolean isBorrowable;

    public ExternalBook(String bookTitle, String authorName, int year, boolean isBorrowable) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.year = year;
        this.isBorrowable = isBorrowable;
    }

    @Override
    public String getTitle() {
        return bookTitle;
    }

    @Override
    public boolean isAvailable() {
        return isBorrowable;
    }

    @Override
    public void setAvailable(boolean available) {
        this.isBorrowable = available;
    }
}

