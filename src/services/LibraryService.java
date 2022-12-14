package services;

import entities.Book;

public interface LibraryService {
    boolean checkBookAvailability(String bookTitle);
    Book findBook(String bookTitle);
}
