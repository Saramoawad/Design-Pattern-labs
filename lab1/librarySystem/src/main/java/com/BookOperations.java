package com;

public interface BookOperations {
    void borrowBook(Borrowable book, User user);
    void returnBook(Borrowable book);
}