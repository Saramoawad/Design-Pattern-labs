package com;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private static LibraryService instance;
    private final List<Borrowable> books = new ArrayList<>();
    private final BookOperations bookOperations;

    private LibraryService(BookOperations bookOperations) {
        this.bookOperations = bookOperations;
    }

    public static LibraryService getInstance(BookOperations bookOperations) {
        if (instance == null) {
            instance = new LibraryService(bookOperations);
        }
        return instance;
    }

    public void addBook(Borrowable book) {
        books.add(book);
    }

    public Borrowable findBook(String title) {
        for (Borrowable book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void borrowBook(String title, User user) {
        Borrowable book = findBook(title);
        if (book == null) {
            System.out.println(title + " is not found in the library.");
        } else {
            bookOperations.borrowBook(book, user);
        }
    }

    public void returnBook(String title) {
        Borrowable book = findBook(title);
        if (book != null) {
            bookOperations.returnBook(book);
        } else {
            System.out.println(title + " is not found in the library.");
        }
    }
}
