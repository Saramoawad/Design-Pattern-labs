package com;

public abstract class Book implements Borrowable {
    private String title;
    private boolean isAvailable;

    public Book(String title) {
        this.title = title;
        this.isAvailable = true;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}