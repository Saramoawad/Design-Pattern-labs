package com;

public class BookFactory {
    public static Borrowable createBook(String type, String title) {
        return switch (type.toLowerCase()) {
            case "physical" -> new PhysicalBook(title);
            case "historical" -> new HistoricalBook(title);
            case "ebook" -> new EBook(title);  
            default -> throw new IllegalArgumentException("Invalid book type: " + type);
        };
    }
}
