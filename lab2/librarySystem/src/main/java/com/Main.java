package com;

public class Main {
    public static void main(String[] args) {
        BookOperations bookService = new BookService();
        LibraryService library = LibraryService.getInstance(bookService);

        Borrowable book1 = BookFactory.createBook("physical", "Harry Potter");
        Borrowable book2 = BookFactory.createBook("historical", "Outlander");
        Borrowable book3 = new PremiumBookDecorator(BookFactory.createBook("physical", "Lord of the Rings"));
        Borrowable book4 = BookFactory.createBook("ebook", "Digital Fortress");

        ExternalBook external = new ExternalBook("Old Archive", "Author", 1985, true);
        Borrowable externalAdapted = new ExternalBookAdapter(external);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(externalAdapted);

        User john = new User("John");
        User alice = new User("Alice", true);

        library.borrowBook("Harry Potter", john);
        System.out.println("=============================");
        library.returnBook("Harry Potter");
        System.out.println("=============================");
        library.borrowBook("Lord of the Rings", alice);
        System.out.println("=============================");
        library.borrowBook("Digital Fortress", john);
        System.out.println("=============================");
        library.borrowBook("Old Archive", john);
    }
}
