package com;

public class BookService implements BookOperations {
    @Override
    public void borrowBook(Borrowable book, User user) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(user.getName() + " successfully borrowed " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is not available.");
        }
    }

    @Override
    public void returnBook(Borrowable book) {
        book.setAvailable(true);
        System.out.println(book.getTitle() + " has been returned.");
    }
}