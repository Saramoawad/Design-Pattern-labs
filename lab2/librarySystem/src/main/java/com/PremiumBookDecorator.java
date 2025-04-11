package com;

public class PremiumBookDecorator implements Borrowable {
    private final Borrowable originalBook;

    public PremiumBookDecorator(Borrowable book) {
        this.originalBook = book;
    }

    @Override
    public boolean isAvailable() {
        return originalBook.isAvailable();
    }

    @Override
    public void setAvailable(boolean available) {
        originalBook.setAvailable(available);
    }

    @Override
    public String getTitle() {
        return "[Premium] " + originalBook.getTitle();
    }
}
