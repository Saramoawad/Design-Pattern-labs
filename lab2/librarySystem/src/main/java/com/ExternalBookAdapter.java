package com;

public class ExternalBookAdapter extends Book {
    private final ExternalBook externalBook;

    public ExternalBookAdapter(ExternalBook externalBook) {
        super(externalBook.getTitle());
        this.externalBook = externalBook;
    }

    @Override
    public boolean isAvailable() {
        return externalBook.isAvailable();
    }

    @Override
    public void setAvailable(boolean available) {
        externalBook.setAvailable(available);
    }
}
