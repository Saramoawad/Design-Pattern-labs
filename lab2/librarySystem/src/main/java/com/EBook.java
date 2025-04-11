package com;

public class EBook extends Book {
    public EBook(String title) {
        super(title);
    }

    @Override
    public void setAvailable(boolean available) {
    }

    @Override
    public boolean isAvailable() {
        return true;
    }
}