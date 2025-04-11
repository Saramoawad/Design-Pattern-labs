package com;
import com.BookOperations;
import com.BookService;
import com.Borrowable;
import com.EBook;
import com.HistoricalBook;
import com.LibraryService;
import com.PhysicalBook;
import com.User;
public class Main {
    public static void main(String[] args) {
        BookOperations bookService = new BookService();
        LibraryService library = new LibraryService(bookService);

        Borrowable book = new PhysicalBook("Harry Potter");
        Borrowable physicalBook = new PhysicalBook("Lord of the Rings");
        Borrowable historicalBook = new HistoricalBook("Outlander");
        Borrowable eBook = new EBook("Digital Fortress");

        library.addBook(book);
        library.addBook(physicalBook);
        library.addBook(historicalBook);
        library.addBook(eBook);

        User john = new User("John");
        User alice = new User("Alice", true);

        library.borrowBook("Harry Potter", john);
        System.out.println("=============================");
        library.returnBook("Harry Potter");
        System.out.println("=============================");
        library.borrowBook("Lord of the Rings", john);
        System.out.println("=============================");
        library.borrowBook("math", john);
        library.returnBook("math");
        System.out.println("=============================");
        library.borrowBook("Digital Fortress", alice);
        System.out.println("=============================");
        library.borrowBook("Outlander", alice);
    }
}